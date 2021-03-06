package com.bytedance.android.livesdk.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.p230g.C3922z;
import com.ss.android.ugc.trill.R;

public class SpecialCombView extends View {
    private static final int ANGLE_360 = 360;
    private static final float PROGRESS_START_ANGLE = -90.0f;
    private int bgColor;
    private RectF bordRectF;
    private LinearGradient bordShader;
    private ValueAnimator borderAnimator;
    private float borderWidth;
    private Bitmap combBitmap;
    private Rect combBmRect;
    private RectF combDrawRectF;
    private Paint mPaint;
    private float progress;
    private float radius;
    private TextPaint textPaint;
    private int time;
    private String timeStr = "1s";
    private int totalTimeCount;
    private float viewHeight;
    private LinearGradient viewShader;
    private float viewWidth;

    public float getProgress() {
        return this.progress;
    }

    private float measureHeight() {
        return getResources().getDimension(R.dimen.rv);
    }

    private float measureWidth() {
        return getResources().getDimension(R.dimen.rw);
    }

    public void endScaleAnim() {
        if (this.borderAnimator != null && this.borderAnimator.isRunning()) {
            this.borderAnimator.end();
        }
    }

    private void init() {
        this.viewWidth = measureWidth();
        this.viewHeight = measureHeight();
        this.borderWidth = getResources().getDimension(R.dimen.rt);
        this.radius = (this.viewWidth - (this.borderWidth * 2.0f)) / 2.0f;
        float f = this.borderWidth / 2.0f;
        this.bordRectF = new RectF(f, f, this.viewWidth - f, this.viewWidth - f);
        this.combBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.bsy);
        this.combBmRect = new Rect(0, 0, this.combBitmap.getWidth(), this.combBitmap.getHeight());
        float a = (float) C3922z.m9899a(11.0f);
        this.combDrawRectF = new RectF(a, a, this.viewWidth - a, this.viewHeight - a);
        this.mPaint = new Paint();
        this.textPaint = new TextPaint();
        this.textPaint.setAntiAlias(true);
        this.textPaint.setTextAlign(Align.CENTER);
        this.textPaint.setColor(getResources().getColor(R.color.akz));
        this.textPaint.setTextSize(getResources().getDimension(R.dimen.ru));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.viewWidth, this.viewHeight, getResources().getColor(R.color.akt), getResources().getColor(R.color.akr), TileMode.CLAMP);
        this.bordShader = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(this.viewWidth, 0.0f, 0.0f, this.viewHeight, getResources().getColor(R.color.akx), getResources().getColor(R.color.akv), TileMode.CLAMP);
        this.viewShader = linearGradient2;
        this.bgColor = getResources().getColor(R.color.akq);
    }

    public void setCountDownTime(int i) {
        this.totalTimeCount = i;
    }

    public SpecialCombView(Context context) {
        super(context);
        init();
    }

    public void setProgress(float f) {
        this.progress = f;
        this.time = ((int) ((f / 360.0f) * ((float) this.totalTimeCount))) + 1;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.time));
        sb.append("s");
        this.timeStr = sb.toString();
        invalidate();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.mPaint.reset();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setColor(this.bgColor);
        canvas.drawCircle(this.viewWidth / 2.0f, this.viewHeight / 2.0f, this.viewWidth / 2.0f, this.mPaint);
        this.mPaint.reset();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setShader(this.bordShader);
        this.mPaint.setStyle(Style.STROKE);
        this.mPaint.setStrokeCap(Cap.ROUND);
        this.mPaint.setStrokeWidth(this.borderWidth);
        canvas.drawArc(this.bordRectF, PROGRESS_START_ANGLE, -this.progress, false, this.mPaint);
        this.mPaint.setStyle(Style.FILL);
        this.mPaint.setShader(this.viewShader);
        canvas.drawCircle(this.viewWidth / 2.0f, this.viewHeight / 2.0f, this.radius, this.mPaint);
        canvas.drawBitmap(this.combBitmap, this.combBmRect, this.combDrawRectF, this.mPaint);
    }

    public void startScaleAnim(long j, AnimatorListener animatorListener) {
        animateBorderView(j, animatorListener);
    }

    public SpecialCombView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension((int) measureWidth(), (int) measureHeight());
    }

    public void setCircleBackgroundColor(int i, int i2) {
        LinearGradient linearGradient = new LinearGradient(this.viewWidth, 0.0f, 0.0f, this.viewHeight, i, i2, TileMode.CLAMP);
        this.viewShader = linearGradient;
    }

    public void setProgressColor(int i, int i2) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.viewWidth, this.viewHeight, i, i2, TileMode.CLAMP);
        this.bordShader = linearGradient;
    }

    private void animateBorderView(long j, AnimatorListener animatorListener) {
        if (this.borderAnimator == null) {
            this.borderAnimator = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            if (animatorListener != null) {
                this.borderAnimator.addListener(animatorListener);
            }
            this.borderAnimator.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    double d = (double) animatedFraction;
                    if (d <= 0.1d) {
                        f = (-animatedFraction) + 1.1f;
                    } else if (d <= 0.3333d) {
                        f = (animatedFraction * 0.4286f) + 0.9571f;
                    } else if (d <= 0.4333d) {
                        f = (-animatedFraction) + 1.4333f;
                    } else if (d <= 0.6667d) {
                        f = (animatedFraction * 0.4286f) + 0.8143f;
                    } else if (d <= 0.7667d) {
                        f = (-animatedFraction) + 1.76667f;
                    } else {
                        f = (animatedFraction * 0.4286f) + 0.6714f;
                    }
                    SpecialCombView.this.setScaleX(f);
                    SpecialCombView.this.setScaleY(f);
                    SpecialCombView.this.invalidate();
                }
            });
            this.borderAnimator.setDuration(j);
        }
        if (this.borderAnimator.isRunning()) {
            this.borderAnimator.cancel();
            setScaleX(1.0f);
            setScaleY(1.0f);
        }
        this.borderAnimator.start();
    }

    public SpecialCombView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}

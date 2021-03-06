package android.support.p043v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p030v4.view.AbsSavedState;
import android.support.p030v4.view.C1039e;
import android.support.p030v4.view.C1043h;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.p044a.p045a.C1124a;
import android.support.p043v7.view.C1220c;
import android.support.p043v7.view.C1225g;
import android.support.p043v7.view.menu.C1246h;
import android.support.p043v7.view.menu.C1246h.C1247a;
import android.support.p043v7.view.menu.C1250j;
import android.support.p043v7.view.menu.C1262o;
import android.support.p043v7.view.menu.C1262o.C1263a;
import android.support.p043v7.view.menu.C1272u;
import android.support.p043v7.widget.ActionMenuView.C1290d;
import android.text.Layout;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.Toolbar */
public class Toolbar extends ViewGroup {
    private C1263a mActionMenuPresenterCallback;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private C1434ar mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private C1380a mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    private C1247a mMenuBuilderCallback;
    private ActionMenuView mMenuView;
    private final C1290d mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    C1381b mOnMenuItemClickListener;
    private ActionMenuPresenter mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private int mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private int mTitleTextColor;
    private TextView mTitleTextView;
    private C1452bc mWrapper;

    /* renamed from: android.support.v7.widget.Toolbar$LayoutParams */
    public static class LayoutParams extends android.support.p043v7.app.ActionBar.LayoutParams {

        /* renamed from: b */
        int f4951b;

        public LayoutParams(android.support.p043v7.app.ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((android.support.p043v7.app.ActionBar.LayoutParams) layoutParams);
            this.f4951b = layoutParams.f4951b;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super((android.view.ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(-2, -2);
            this.f3592a = 8388627;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$SavedState */
    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        int f4952a;

        /* renamed from: b */
        boolean f4953b;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4952a);
            parcel.writeInt(this.f4953b ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            boolean z;
            super(parcel, classLoader);
            this.f4952a = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f4953b = z;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$a */
    class C1380a implements C1262o {

        /* renamed from: a */
        C1246h f4954a;

        /* renamed from: b */
        C1250j f4955b;

        /* renamed from: a */
        public final void mo1083a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public final void mo1084a(C1246h hVar, boolean z) {
        }

        /* renamed from: a */
        public final void mo1085a(C1263a aVar) {
        }

        /* renamed from: a */
        public final boolean mo1087a() {
            return false;
        }

        /* renamed from: a */
        public final boolean mo1089a(C1272u uVar) {
            return false;
        }

        /* renamed from: b */
        public final int mo1090b() {
            return 0;
        }

        /* renamed from: c */
        public final Parcelable mo1092c() {
            return null;
        }

        C1380a() {
        }

        /* renamed from: a */
        public final void mo1086a(boolean z) {
            if (this.f4955b != null) {
                boolean z2 = false;
                if (this.f4954a != null) {
                    int size = this.f4954a.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f4954a.getItem(i) == this.f4955b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo1091b(this.f4954a, this.f4955b);
                }
            }
        }

        /* renamed from: a */
        public final void mo1082a(Context context, C1246h hVar) {
            if (!(this.f4954a == null || this.f4955b == null)) {
                this.f4954a.mo4136d(this.f4955b);
            }
            this.f4954a = hVar;
        }

        /* renamed from: b */
        public final boolean mo1091b(C1246h hVar, C1250j jVar) {
            if (Toolbar.this.mExpandedActionView instanceof C1220c) {
                ((C1220c) Toolbar.this.mExpandedActionView).mo3939b();
            }
            Toolbar.this.removeView(Toolbar.this.mExpandedActionView);
            Toolbar.this.removeView(Toolbar.this.mCollapseButtonView);
            Toolbar.this.mExpandedActionView = null;
            Toolbar.this.addChildrenForExpandedActionView();
            this.f4955b = null;
            Toolbar.this.requestLayout();
            jVar.mo4170e(false);
            return true;
        }

        /* renamed from: a */
        public final boolean mo1088a(C1246h hVar, C1250j jVar) {
            Toolbar.this.ensureCollapseButtonView();
            ViewParent parent = Toolbar.this.mCollapseButtonView.getParent();
            if (parent != Toolbar.this) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(Toolbar.this.mCollapseButtonView);
                }
                Toolbar.this.addView(Toolbar.this.mCollapseButtonView);
            }
            Toolbar.this.mExpandedActionView = jVar.getActionView();
            this.f4955b = jVar;
            ViewParent parent2 = Toolbar.this.mExpandedActionView.getParent();
            if (parent2 != Toolbar.this) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(Toolbar.this.mExpandedActionView);
                }
                LayoutParams generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                generateDefaultLayoutParams.f3592a = 8388611 | (Toolbar.this.mButtonGravity & 112);
                generateDefaultLayoutParams.f4951b = 2;
                Toolbar.this.mExpandedActionView.setLayoutParams(generateDefaultLayoutParams);
                Toolbar.this.addView(Toolbar.this.mExpandedActionView);
            }
            Toolbar.this.removeChildrenForExpandedActionView();
            Toolbar.this.requestLayout();
            jVar.mo4170e(true);
            if (Toolbar.this.mExpandedActionView instanceof C1220c) {
                ((C1220c) Toolbar.this.mExpandedActionView).mo3938a();
            }
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$b */
    public interface C1381b {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* access modifiers changed from: 0000 */
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    /* access modifiers changed from: 0000 */
    public Context getPopupContext() {
        return this.mPopupContext;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new C1434ar();
        }
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
    }

    private MenuInflater getMenuInflater() {
        return new C1225g(getContext());
    }

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    public void collapseActionView() {
        C1250j jVar;
        if (this.mExpandedMenuPresenter == null) {
            jVar = null;
        } else {
            jVar = this.mExpandedMenuPresenter.f4955b;
        }
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        if (this.mMenuView != null) {
            this.mMenuView.mo4433b();
        }
    }

    public int getContentInsetEndWithActions() {
        if (this.mContentInsetEndWithActions != Integer.MIN_VALUE) {
            return this.mContentInsetEndWithActions;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        if (this.mContentInsets != null) {
            return this.mContentInsets.f5158a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        if (this.mContentInsets != null) {
            return this.mContentInsets.f5159b;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        if (this.mContentInsetStartWithNavigation != Integer.MIN_VALUE) {
            return this.mContentInsetStartWithNavigation;
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        if (this.mLogoView != null) {
            return this.mLogoView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        if (this.mLogoView != null) {
            return this.mLogoView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        if (this.mNavButtonView != null) {
            return this.mNavButtonView.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        if (this.mNavButtonView != null) {
            return this.mNavButtonView.getDrawable();
        }
        return null;
    }

    public Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    public C1505v getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new C1452bc(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        if (this.mExpandedMenuPresenter == null || this.mExpandedMenuPresenter.f4955b == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
    }

    /* access modifiers changed from: 0000 */
    public void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView((View) this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    public boolean canShowOverflowMenu() {
        if (getVisibility() != 0 || this.mMenuView == null || !this.mMenuView.f4410b) {
            return false;
        }
        return true;
    }

    public int getContentInsetEnd() {
        int i;
        if (this.mContentInsets != null) {
            C1434ar arVar = this.mContentInsets;
            if (!arVar.f5164g) {
                return arVar.f5159b;
            }
            i = arVar.f5158a;
        } else {
            i = 0;
        }
        return i;
    }

    public int getContentInsetStart() {
        int i;
        if (this.mContentInsets != null) {
            C1434ar arVar = this.mContentInsets;
            if (!arVar.f5164g) {
                return arVar.f5158a;
            }
            i = arVar.f5159b;
        } else {
            i = 0;
        }
        return i;
    }

    public int getCurrentContentInsetLeft() {
        if (C1056u.m3055f(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C1056u.m3055f(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0));
        }
        return getContentInsetStart();
    }

    public boolean hideOverflowMenu() {
        boolean z;
        if (this.mMenuView != null) {
            ActionMenuView actionMenuView = this.mMenuView;
            if (actionMenuView.f4411c == null || !actionMenuView.f4411c.mo4416e()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        boolean z;
        if (this.mMenuView != null) {
            ActionMenuView actionMenuView = this.mMenuView;
            if (actionMenuView.f4411c == null || !actionMenuView.f4411c.mo4419h()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public boolean showOverflowMenu() {
        boolean z;
        if (this.mMenuView != null) {
            ActionMenuView actionMenuView = this.mMenuView;
            if (actionMenuView.f4411c == null || !actionMenuView.f4411c.mo4415d()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private void ensureMenu() {
        ensureMenuView();
        if (this.mMenuView.f4409a == null) {
            C1246h hVar = (C1246h) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new C1380a();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            hVar.mo4111a((C1262o) this.mExpandedMenuPresenter, this.mPopupContext);
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            this.mMenuView = new ActionMenuView(getContext());
            this.mMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.mo4431a(this.mActionMenuPresenterCallback, this.mMenuBuilderCallback);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f3592a = 8388613 | (this.mButtonGravity & 112);
            this.mMenuView.setLayoutParams(generateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new AppCompatImageButton(getContext(), null, R.attr.a7_);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f3592a = 8388611 | (this.mButtonGravity & 112);
            this.mNavButtonView.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private boolean shouldCollapse() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            android.support.v7.widget.ActionMenuView r0 = r3.mMenuView
            r1 = 0
            if (r0 == 0) goto L_0x0013
            android.support.v7.widget.ActionMenuView r0 = r3.mMenuView
            android.support.v7.view.menu.h r0 = r0.f4409a
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.mContentInsetEndWithActions
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            return r0
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isOverflowMenuShowPending() {
        /*
            r4 = this;
            android.support.v7.widget.ActionMenuView r0 = r4.mMenuView
            r1 = 0
            if (r0 == 0) goto L_0x0024
            android.support.v7.widget.ActionMenuView r0 = r4.mMenuView
            android.support.v7.widget.ActionMenuPresenter r2 = r0.f4411c
            r3 = 1
            if (r2 == 0) goto L_0x0020
            android.support.v7.widget.ActionMenuPresenter r0 = r0.f4411c
            android.support.v7.widget.ActionMenuPresenter$c r2 = r0.f4387p
            if (r2 != 0) goto L_0x001b
            boolean r0 = r0.mo4419h()
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            if (r0 == 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 == 0) goto L_0x0024
            return r3
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.Toolbar.isOverflowMenuShowPending():boolean");
    }

    public boolean isTitleTruncated() {
        if (this.mTitleTextView == null) {
            return false;
        }
        Layout layout = this.mTitleTextView.getLayout();
        if (layout == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (!(this.mExpandedMenuPresenter == null || this.mExpandedMenuPresenter.f4955b == null)) {
            savedState.f4952a = this.mExpandedMenuPresenter.f4955b.getItemId();
        }
        savedState.f4953b = isOverflowMenuShowing();
        return savedState;
    }

    /* access modifiers changed from: 0000 */
    public void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((LayoutParams) childAt.getLayoutParams()).f4951b == 2 || childAt == this.mMenuView)) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            this.mCollapseButtonView = new AppCompatImageButton(getContext(), null, R.attr.a7_);
            this.mCollapseButtonView.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f3592a = 8388611 | (this.mButtonGravity & 112);
            generateDefaultLayoutParams.f4951b = 2;
            this.mCollapseButtonView.setLayoutParams(generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    Toolbar.this.collapseActionView();
                }
            });
        }
    }

    public void setOnMenuItemClickListener(C1381b bVar) {
        this.mOnMenuItemClickListener = bVar;
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.mTitleMarginBottom = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.mTitleMarginEnd = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.mTitleMarginStart = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.mTitleMarginTop = i;
        requestLayout();
    }

    private int getHorizontalMargins(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return C1043h.m2978a(marginLayoutParams) + C1043h.m2980b(marginLayoutParams);
    }

    private int getVerticalMargins(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static boolean isCustomView(View view) {
        if (((LayoutParams) view.getLayoutParams()).f4951b == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof LayoutParams)) {
            return false;
        }
        return true;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void inflateMenu(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public void setLogo(int i) {
        setLogo(C1124a.m3315b(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getContext().getText(i);
        } else {
            charSequence = null;
        }
        setNavigationContentDescription(charSequence);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C1124a.m3315b(getContext(), i));
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        this.mSubtitleTextColor = i;
        if (this.mSubtitleTextView != null) {
            this.mSubtitleTextView.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleTextColor(int i) {
        this.mTitleTextColor = i;
        if (this.mTitleTextView != null) {
            this.mTitleTextView.setTextColor(i);
        }
    }

    private int getChildHorizontalGravity(int i) {
        int f = C1056u.m3055f(this);
        int a = C1039e.m2968a(i, f) & 7;
        if (a == 1 || a == 3 || a == 5) {
            return a;
        }
        if (f == 1) {
            return 5;
        }
        return 3;
    }

    private int getChildVerticalGravity(int i) {
        int i2 = i & 112;
        if (i2 == 16 || i2 == 48 || i2 == 80) {
            return i2;
        }
        return this.mGravity & 112;
    }

    private boolean isChildOrHidden(View view) {
        if (view.getParent() == this || this.mHiddenViews.contains(view)) {
            return true;
        }
        return false;
    }

    private boolean shouldLayout(View view) {
        if (view == null || view.getParent() != this || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = DynamicTabYellowPointVersion.DEFAULT;
        }
        if (i != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = DynamicTabYellowPointVersion.DEFAULT;
        }
        if (i != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        if (this.mLogoView != null) {
            this.mLogoView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        if (this.mNavButtonView != null) {
            this.mNavButtonView.setContentDescription(charSequence);
        }
    }

    public void setPopupTheme(int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
                return;
            }
            this.mPopupContext = new ContextThemeWrapper(getContext(), i);
        }
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof android.support.p043v7.app.ActionBar.LayoutParams) {
            return new LayoutParams((android.support.p043v7.app.ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        C1246h hVar;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3119e);
        if (this.mMenuView != null) {
            hVar = this.mMenuView.f4409a;
        } else {
            hVar = null;
        }
        if (!(savedState.f4952a == 0 || this.mExpandedMenuPresenter == null || hVar == null)) {
            MenuItem findItem = hVar.findItem(savedState.f4952a);
            if (findItem != null) {
                findItem.expandActionView();
            }
        }
        if (savedState.f4953b) {
            postShowOverflowMenu();
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ensureLogoView();
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else if (this.mLogoView != null && isChildOrHidden(this.mLogoView)) {
            removeView(this.mLogoView);
            this.mHiddenViews.remove(this.mLogoView);
        }
        if (this.mLogoView != null) {
            this.mLogoView.setImageDrawable(drawable);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else if (this.mNavButtonView != null && isChildOrHidden(this.mNavButtonView)) {
            removeView(this.mNavButtonView);
            this.mHiddenViews.remove(this.mNavButtonView);
        }
        if (this.mNavButtonView != null) {
            this.mNavButtonView.setImageDrawable(drawable);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        ensureContentInsets();
        C1434ar arVar = this.mContentInsets;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != arVar.f5164g) {
            arVar.f5164g = z;
            if (!arVar.f5165h) {
                arVar.f5158a = arVar.f5162e;
                arVar.f5159b = arVar.f5163f;
            } else if (z) {
                if (arVar.f5161d != Integer.MIN_VALUE) {
                    i4 = arVar.f5161d;
                } else {
                    i4 = arVar.f5162e;
                }
                arVar.f5158a = i4;
                if (arVar.f5160c != Integer.MIN_VALUE) {
                    i5 = arVar.f5160c;
                } else {
                    i5 = arVar.f5163f;
                }
                arVar.f5159b = i5;
            } else {
                if (arVar.f5160c != Integer.MIN_VALUE) {
                    i2 = arVar.f5160c;
                } else {
                    i2 = arVar.f5162e;
                }
                arVar.f5158a = i2;
                if (arVar.f5161d != Integer.MIN_VALUE) {
                    i3 = arVar.f5161d;
                } else {
                    i3 = arVar.f5163f;
                }
                arVar.f5159b = i3;
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                this.mSubtitleTextView = new AppCompatTextView(context);
                this.mSubtitleTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TruncateAt.END);
                if (this.mSubtitleTextAppearance != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, this.mSubtitleTextAppearance);
                }
                if (this.mSubtitleTextColor != 0) {
                    this.mSubtitleTextView.setTextColor(this.mSubtitleTextColor);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        } else if (this.mSubtitleTextView != null && isChildOrHidden(this.mSubtitleTextView)) {
            removeView(this.mSubtitleTextView);
            this.mHiddenViews.remove(this.mSubtitleTextView);
        }
        if (this.mSubtitleTextView != null) {
            this.mSubtitleTextView.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                this.mTitleTextView = new AppCompatTextView(context);
                this.mTitleTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TruncateAt.END);
                if (this.mTitleTextAppearance != 0) {
                    this.mTitleTextView.setTextAppearance(context, this.mTitleTextAppearance);
                }
                if (this.mTitleTextColor != 0) {
                    this.mTitleTextView.setTextColor(this.mTitleTextColor);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        } else if (this.mTitleTextView != null && isChildOrHidden(this.mTitleTextView)) {
            removeView(this.mTitleTextView);
            this.mHiddenViews.remove(this.mTitleTextView);
        }
        if (this.mTitleTextView != null) {
            this.mTitleTextView.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a7a);
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.mo5605b(i, i2);
    }

    public void setContentInsetsRelative(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.mo5604a(i, i2);
    }

    public void setMenuCallbacks(C1263a aVar, C1247a aVar2) {
        this.mActionMenuPresenterCallback = aVar;
        this.mMenuBuilderCallback = aVar2;
        if (this.mMenuView != null) {
            this.mMenuView.mo4431a(aVar, aVar2);
        }
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.mSubtitleTextAppearance = i;
        if (this.mSubtitleTextView != null) {
            this.mSubtitleTextView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.mTitleTextAppearance = i;
        if (this.mTitleTextView != null) {
            this.mTitleTextView.setTextAppearance(context, i);
        }
    }

    private void addSystemView(View view, boolean z) {
        LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = generateLayoutParams(layoutParams2);
        } else {
            layoutParams = (LayoutParams) layoutParams2;
        }
        layoutParams.f4951b = 1;
        if (!z || this.mExpandedActionView == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.mHiddenViews.add(view);
    }

    private int getViewListMeasuredWidth(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            View view = (View) list.get(i4);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i6 = layoutParams.leftMargin - i;
            int i7 = layoutParams.rightMargin - i3;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i7);
            int max3 = Math.max(0, -i6);
            i5 += max + view.getMeasuredWidth() + max2;
            i4++;
            i3 = Math.max(0, -i7);
            i = max3;
        }
        return i5;
    }

    private void addCustomViewsWithGravity(List<View> list, int i) {
        boolean z;
        if (C1056u.m3055f(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int a = C1039e.m2968a(i, C1056u.m3055f(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f4951b == 0 && shouldLayout(childAt) && getChildHorizontalGravity(layoutParams.f3592a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f4951b == 0 && shouldLayout(childAt2) && getChildHorizontalGravity(layoutParams2.f3592a) == a) {
                list.add(childAt2);
            }
        }
    }

    private int getChildTop(View view, int i) {
        int i2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int childVerticalGravity = getChildVerticalGravity(layoutParams.f3592a);
        if (childVerticalGravity == 48) {
            return getPaddingTop() - i2;
        }
        if (childVerticalGravity == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i3 < layoutParams.topMargin) {
            i3 = layoutParams.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            if (i4 < layoutParams.bottomMargin) {
                i3 = Math.max(0, i3 - (layoutParams.bottomMargin - i4));
            }
        }
        return paddingTop + i3;
    }

    public void setMenu(C1246h hVar, ActionMenuPresenter actionMenuPresenter) {
        if (hVar != null || this.mMenuView != null) {
            ensureMenuView();
            C1246h hVar2 = this.mMenuView.f4409a;
            if (hVar2 != hVar) {
                if (hVar2 != null) {
                    hVar2.mo4125b((C1262o) this.mOuterActionMenuPresenter);
                    hVar2.mo4125b((C1262o) this.mExpandedMenuPresenter);
                }
                if (this.mExpandedMenuPresenter == null) {
                    this.mExpandedMenuPresenter = new C1380a();
                }
                actionMenuPresenter.f4384m = true;
                if (hVar != null) {
                    hVar.mo4111a((C1262o) actionMenuPresenter, this.mPopupContext);
                    hVar.mo4111a((C1262o) this.mExpandedMenuPresenter, this.mPopupContext);
                } else {
                    actionMenuPresenter.mo1082a(this.mPopupContext, (C1246h) null);
                    this.mExpandedMenuPresenter.mo1082a(this.mPopupContext, (C1246h) null);
                    actionMenuPresenter.mo1086a(true);
                    this.mExpandedMenuPresenter.mo1086a(true);
                }
                this.mMenuView.setPopupTheme(this.mPopupTheme);
                this.mMenuView.setPresenter(actionMenuPresenter);
                this.mOuterActionMenuPresenter = actionMenuPresenter;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.mTempMargins;
        if (C1467bj.m5138a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            i5 = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            i4 = Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            i3 = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            i5 = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            i4 = Math.max(i4, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            i3 = View.combineMeasuredStates(i3, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5) + 0;
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i, max, i2, 0, this.mMaxButtonHeight);
            i6 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            i4 = Math.max(i4, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            i3 = View.combineMeasuredStates(i3, this.mMenuView.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (shouldLayout(this.mExpandedActionView)) {
            max2 += measureChildCollapseMargins(this.mExpandedActionView, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            i3 = View.combineMeasuredStates(i3, this.mExpandedActionView.getMeasuredState());
        }
        if (shouldLayout(this.mLogoView)) {
            max2 += measureChildCollapseMargins(this.mLogoView, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            i3 = View.combineMeasuredStates(i3, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = i4;
        int i11 = max2;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((LayoutParams) childAt.getLayoutParams()).f4951b == 0 && shouldLayout(childAt)) {
                i11 += measureChildCollapseMargins(childAt, i, i11, i2, 0, iArr);
                i10 = Math.max(i10, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i13 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i14 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i, i11 + i14, i2, i13, iArr);
            int measuredWidth = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
            i7 = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            i9 = View.combineMeasuredStates(i3, this.mTitleTextView.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            int i15 = i7 + i13;
            int i16 = i9;
            i8 = Math.max(i8, measureChildCollapseMargins(this.mSubtitleTextView, i, i11 + i14, i2, i15, iArr));
            i7 += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            i9 = View.combineMeasuredStates(i16, this.mSubtitleTextView.getMeasuredState());
        } else {
            int i17 = i9;
        }
        int i18 = i11 + i8;
        int max3 = Math.max(i10, i7) + getPaddingTop() + getPaddingBottom();
        int i19 = i;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(i18 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i19, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(max3, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (shouldCollapse()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuViewItemClickListener = new C1290d() {
            /* renamed from: a */
            public final boolean mo4453a(MenuItem menuItem) {
                if (Toolbar.this.mOnMenuItemClickListener != null) {
                    return Toolbar.this.mOnMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }
        };
        this.mShowOverflowMenuRunnable = new Runnable() {
            public final void run() {
                Toolbar.this.showOverflowMenu();
            }
        };
        C1451bb a = C1451bb.m5032a(getContext(), attributeSet, new int[]{16842927, 16843072, R.attr.dm, R.attr.fh, R.attr.fi, R.attr.i5, R.attr.i6, R.attr.i7, R.attr.i8, R.attr.i9, R.attr.i_, R.attr.t8, R.attr.t9, R.attr.ts, R.attr.ul, R.attr.um, R.attr.vs, R.attr.a3v, R.attr.a3w, R.attr.a3x, R.attr.a6u, R.attr.a6w, R.attr.a6x, R.attr.a6y, R.attr.a6z, R.attr.a70, R.attr.a71, R.attr.a73, R.attr.a74}, i, 0);
        this.mTitleTextAppearance = a.mo5665g(27, 0);
        this.mSubtitleTextAppearance = a.mo5665g(18, 0);
        this.mGravity = a.mo5657c(0, this.mGravity);
        this.mButtonGravity = a.mo5657c(2, 48);
        int d = a.mo5659d(21, 0);
        if (a.mo5664f(26)) {
            d = a.mo5659d(26, d);
        }
        this.mTitleMarginBottom = d;
        this.mTitleMarginTop = d;
        this.mTitleMarginEnd = d;
        this.mTitleMarginStart = d;
        int d2 = a.mo5659d(24, -1);
        if (d2 >= 0) {
            this.mTitleMarginStart = d2;
        }
        int d3 = a.mo5659d(23, -1);
        if (d3 >= 0) {
            this.mTitleMarginEnd = d3;
        }
        int d4 = a.mo5659d(25, -1);
        if (d4 >= 0) {
            this.mTitleMarginTop = d4;
        }
        int d5 = a.mo5659d(22, -1);
        if (d5 >= 0) {
            this.mTitleMarginBottom = d5;
        }
        this.mMaxButtonHeight = a.mo5661e(13, -1);
        int d6 = a.mo5659d(9, DynamicTabYellowPointVersion.DEFAULT);
        int d7 = a.mo5659d(5, DynamicTabYellowPointVersion.DEFAULT);
        int e = a.mo5661e(7, 0);
        int e2 = a.mo5661e(8, 0);
        ensureContentInsets();
        this.mContentInsets.mo5605b(e, e2);
        if (!(d6 == Integer.MIN_VALUE && d7 == Integer.MIN_VALUE)) {
            this.mContentInsets.mo5604a(d6, d7);
        }
        this.mContentInsetStartWithNavigation = a.mo5659d(10, DynamicTabYellowPointVersion.DEFAULT);
        this.mContentInsetEndWithActions = a.mo5659d(6, DynamicTabYellowPointVersion.DEFAULT);
        this.mCollapseIcon = a.mo5652a(4);
        this.mCollapseDescription = a.mo5658c(3);
        CharSequence c = a.mo5658c(20);
        if (!TextUtils.isEmpty(c)) {
            setTitle(c);
        }
        CharSequence c2 = a.mo5658c(17);
        if (!TextUtils.isEmpty(c2)) {
            setSubtitle(c2);
        }
        this.mPopupContext = getContext();
        setPopupTheme(a.mo5665g(16, 0));
        Drawable a2 = a.mo5652a(15);
        if (a2 != null) {
            setNavigationIcon(a2);
        }
        CharSequence c3 = a.mo5658c(14);
        if (!TextUtils.isEmpty(c3)) {
            setNavigationContentDescription(c3);
        }
        Drawable a3 = a.mo5652a(11);
        if (a3 != null) {
            setLogo(a3);
        }
        CharSequence c4 = a.mo5658c(12);
        if (!TextUtils.isEmpty(c4)) {
            setLogoDescription(c4);
        }
        if (a.mo5664f(28)) {
            setTitleTextColor(a.mo5655b(28, -1));
        }
        if (a.mo5664f(19)) {
            setSubtitleTextColor(a.mo5655b(19, -1));
        }
        a.mo5653a();
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.mTitleMarginStart = i;
        this.mTitleMarginTop = i2;
        this.mTitleMarginEnd = i3;
        this.mTitleMarginBottom = i4;
        requestLayout();
    }

    private int layoutChildLeft(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, childTop, max + measuredWidth, view.getMeasuredHeight() + childTop);
        return max + measuredWidth + layoutParams.rightMargin;
    }

    private int layoutChildRight(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, childTop, max, view.getMeasuredHeight() + childTop);
        return max - (measuredWidth + layoutParams.leftMargin);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02aa A[LOOP:0: B:101:0x02a8->B:102:0x02aa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02cc A[LOOP:1: B:104:0x02ca->B:105:0x02cc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0306 A[LOOP:2: B:112:0x0304->B:113:0x0306, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            r24 = this;
            r0 = r24
            int r1 = android.support.p030v4.view.C1056u.m3055f(r24)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r24.getWidth()
            int r5 = r24.getHeight()
            int r6 = r24.getPaddingLeft()
            int r7 = r24.getPaddingRight()
            int r8 = r24.getPaddingTop()
            int r9 = r24.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.mTempMargins
            r11[r2] = r3
            r11[r3] = r3
            int r12 = android.support.p030v4.view.C1056u.m3066l(r24)
            if (r12 < 0) goto L_0x003a
            int r13 = r29 - r27
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.mNavButtonView
            boolean r13 = r0.shouldLayout(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004d
            android.widget.ImageButton r13 = r0.mNavButtonView
            int r13 = r0.layoutChildRight(r13, r10, r11, r12)
            r14 = r6
            goto L_0x0057
        L_0x004d:
            android.widget.ImageButton r13 = r0.mNavButtonView
            int r13 = r0.layoutChildLeft(r13, r6, r11, r12)
            r14 = r13
            goto L_0x0056
        L_0x0055:
            r14 = r6
        L_0x0056:
            r13 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.mCollapseButtonView
            boolean r15 = r0.shouldLayout(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.mCollapseButtonView
            int r13 = r0.layoutChildRight(r15, r13, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.mCollapseButtonView
            int r14 = r0.layoutChildLeft(r15, r14, r11, r12)
        L_0x006e:
            android.support.v7.widget.ActionMenuView r15 = r0.mMenuView
            boolean r15 = r0.shouldLayout(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            android.support.v7.widget.ActionMenuView r15 = r0.mMenuView
            int r14 = r0.layoutChildLeft(r15, r14, r11, r12)
            goto L_0x0085
        L_0x007f:
            android.support.v7.widget.ActionMenuView r15 = r0.mMenuView
            int r13 = r0.layoutChildRight(r15, r13, r11, r12)
        L_0x0085:
            int r15 = r24.getCurrentContentInsetLeft()
            int r16 = r24.getCurrentContentInsetRight()
            int r2 = r15 - r14
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r13
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r14, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r13, r10)
            android.view.View r13 = r0.mExpandedActionView
            boolean r13 = r0.shouldLayout(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.mExpandedActionView
            int r10 = r0.layoutChildRight(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.mExpandedActionView
            int r2 = r0.layoutChildLeft(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.mLogoView
            boolean r13 = r0.shouldLayout(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.mLogoView
            int r10 = r0.layoutChildRight(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.mLogoView
            int r2 = r0.layoutChildLeft(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.mTitleTextView
            boolean r13 = r0.shouldLayout(r13)
            android.widget.TextView r14 = r0.mSubtitleTextView
            boolean r14 = r0.shouldLayout(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.mTitleTextView
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r15 = (android.support.p043v7.widget.Toolbar.LayoutParams) r15
            int r3 = r15.topMargin
            r19 = r7
            android.widget.TextView r7 = r0.mTitleTextView
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r19 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.mSubtitleTextView
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r7 = (android.support.p043v7.widget.Toolbar.LayoutParams) r7
            int r15 = r7.topMargin
            r20 = r4
            android.widget.TextView r4 = r0.mSubtitleTextView
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r20 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r21 = r6
            r22 = r12
        L_0x0128:
            r7 = 0
            goto L_0x029a
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.mTitleTextView
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.mSubtitleTextView
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.mSubtitleTextView
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.mTitleTextView
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r4 = (android.support.p043v7.widget.Toolbar.LayoutParams) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r7 = (android.support.p043v7.widget.Toolbar.LayoutParams) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.mTitleTextView
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015d
            android.widget.TextView r15 = r0.mSubtitleTextView
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x0159:
            r21 = r6
            r15 = 1
            goto L_0x0160
        L_0x015d:
            r21 = r6
            r15 = 0
        L_0x0160:
            int r6 = r0.mGravity
            r6 = r6 & 112(0x70, float:1.57E-43)
            r22 = r12
            r12 = 48
            if (r6 == r12) goto L_0x01a9
            r12 = 80
            if (r6 == r12) goto L_0x019d
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r23 = r2
            int r2 = r0.mTitleMarginTop
            int r12 = r12 + r2
            if (r6 >= r12) goto L_0x0184
            int r2 = r4.topMargin
            int r3 = r0.mTitleMarginTop
            int r6 = r2 + r3
            goto L_0x019b
        L_0x0184:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.mTitleMarginBottom
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x019b
            int r2 = r7.bottomMargin
            int r3 = r0.mTitleMarginBottom
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x019b:
            int r8 = r8 + r6
            goto L_0x01b6
        L_0x019d:
            r23 = r2
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.mTitleMarginBottom
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b6
        L_0x01a9:
            r23 = r2
            int r2 = r24.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.mTitleMarginTop
            int r8 = r2 + r3
        L_0x01b6:
            if (r1 == 0) goto L_0x022b
            if (r15 == 0) goto L_0x01be
            int r3 = r0.mTitleMarginStart
            r1 = 1
            goto L_0x01c0
        L_0x01be:
            r1 = 1
            r3 = 0
        L_0x01c0:
            r2 = r11[r1]
            int r3 = r3 - r2
            r2 = 0
            int r4 = java.lang.Math.max(r2, r3)
            int r10 = r10 - r4
            int r3 = -r3
            int r3 = java.lang.Math.max(r2, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x01f6
            android.widget.TextView r1 = r0.mTitleTextView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r1 = (android.support.p043v7.widget.Toolbar.LayoutParams) r1
            android.widget.TextView r2 = r0.mTitleTextView
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.mTitleTextView
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.mTitleTextView
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.mTitleMarginEnd
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f7
        L_0x01f6:
            r2 = r10
        L_0x01f7:
            if (r14 == 0) goto L_0x021f
            android.widget.TextView r1 = r0.mSubtitleTextView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r1 = (android.support.p043v7.widget.Toolbar.LayoutParams) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.mSubtitleTextView
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.mSubtitleTextView
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.mSubtitleTextView
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.mTitleMarginEnd
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x0220
        L_0x021f:
            r3 = r10
        L_0x0220:
            if (r15 == 0) goto L_0x0227
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x0227:
            r2 = r23
            goto L_0x0128
        L_0x022b:
            if (r15 == 0) goto L_0x0233
            int r3 = r0.mTitleMarginStart
            r18 = r3
            r7 = 0
            goto L_0x0236
        L_0x0233:
            r7 = 0
            r18 = 0
        L_0x0236:
            r1 = r11[r7]
            int r1 = r18 - r1
            int r2 = java.lang.Math.max(r7, r1)
            int r2 = r23 + r2
            int r1 = -r1
            int r1 = java.lang.Math.max(r7, r1)
            r11[r7] = r1
            if (r13 == 0) goto L_0x026c
            android.widget.TextView r1 = r0.mTitleTextView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r1 = (android.support.p043v7.widget.Toolbar.LayoutParams) r1
            android.widget.TextView r3 = r0.mTitleTextView
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r4 = r0.mTitleTextView
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.mTitleTextView
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.mTitleMarginEnd
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x026d
        L_0x026c:
            r3 = r2
        L_0x026d:
            if (r14 == 0) goto L_0x0293
            android.widget.TextView r1 = r0.mSubtitleTextView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r1 = (android.support.p043v7.widget.Toolbar.LayoutParams) r1
            int r4 = r1.topMargin
            int r8 = r8 + r4
            android.widget.TextView r4 = r0.mSubtitleTextView
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.mSubtitleTextView
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.mSubtitleTextView
            r6.layout(r2, r8, r4, r5)
            int r5 = r0.mTitleMarginEnd
            int r4 = r4 + r5
            int r1 = r1.bottomMargin
            goto L_0x0294
        L_0x0293:
            r4 = r2
        L_0x0294:
            if (r15 == 0) goto L_0x029a
            int r2 = java.lang.Math.max(r3, r4)
        L_0x029a:
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            r3 = 3
            r0.addCustomViewsWithGravity(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x02a8:
            if (r2 >= r1) goto L_0x02bb
            java.util.ArrayList<android.view.View> r4 = r0.mTempViews
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.layoutChildLeft(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x02a8
        L_0x02bb:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            r2 = 5
            r0.addCustomViewsWithGravity(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            int r1 = r1.size()
            r2 = 0
        L_0x02ca:
            if (r2 >= r1) goto L_0x02db
            java.util.ArrayList<android.view.View> r4 = r0.mTempViews
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.layoutChildRight(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02ca
        L_0x02db:
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            r2 = 1
            r0.addCustomViewsWithGravity(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            int r1 = r0.getViewListMeasuredWidth(r1, r11)
            int r4 = r20 - r21
            int r4 = r4 - r19
            int r4 = r4 / 2
            int r6 = r21 + r4
            int r2 = r1 / 2
            int r2 = r6 - r2
            int r1 = r1 + r2
            if (r2 >= r3) goto L_0x02f7
            goto L_0x02fe
        L_0x02f7:
            if (r1 <= r10) goto L_0x02fd
            int r1 = r1 - r10
            int r3 = r2 - r1
            goto L_0x02fe
        L_0x02fd:
            r3 = r2
        L_0x02fe:
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            int r1 = r1.size()
        L_0x0304:
            if (r7 >= r1) goto L_0x0315
            java.util.ArrayList<android.view.View> r2 = r0.mTempViews
            java.lang.Object r2 = r2.get(r7)
            android.view.View r2 = (android.view.View) r2
            int r3 = r0.layoutChildLeft(r2, r3, r11, r12)
            int r7 = r7 + 1
            goto L_0x0304
        L_0x0315:
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    private int measureChildCollapseMargins(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void measureChildConstrained(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }
}

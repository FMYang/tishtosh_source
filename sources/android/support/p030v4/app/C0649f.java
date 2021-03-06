package android.support.p030v4.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager.BadTokenException;

/* renamed from: android.support.v4.app.f */
public class C0649f extends Fragment implements OnCancelListener, OnDismissListener {
    int mBackStackId = -1;
    public boolean mCancelable = true;
    Dialog mDialog;
    boolean mDismissed;
    boolean mShownByMe;
    public boolean mShowsDialog = true;
    int mStyle;
    public int mTheme;
    boolean mViewDestroyed;

    public Dialog getDialog() {
        return this.mDialog;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onStart() {
        try {
            onStart$___twin___();
        } catch (BadTokenException unused) {
        }
    }

    public void dismiss() {
        dismissInternal(false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true);
    }

    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
    }

    public void onStart$___twin___() {
        super.onStart();
        if (this.mDialog != null) {
            this.mViewDestroyed = false;
            this.mDialog.show();
        }
    }

    public void onStop() {
        super.onStop();
        if (this.mDialog != null) {
            this.mDialog.hide();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.mDialog != null) {
            this.mViewDestroyed = true;
            C0650g.m1771a(this.mDialog);
            this.mDialog = null;
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (!this.mShownByMe) {
            this.mDismissed = false;
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return new Dialog(getActivity(), this.mTheme);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.mViewDestroyed) {
            dismissInternal(true);
        }
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        if (this.mDialog != null) {
            this.mDialog.setCancelable(z);
        }
    }

    /* access modifiers changed from: 0000 */
    public void dismissInternal(boolean z) {
        if (!this.mDismissed) {
            this.mDismissed = true;
            this.mShownByMe = false;
            if (this.mDialog != null) {
                C0650g.m1771a(this.mDialog);
            }
            this.mViewDestroyed = true;
            if (this.mBackStackId >= 0) {
                getFragmentManager().mo2226a(this.mBackStackId, 1);
                this.mBackStackId = -1;
                return;
            }
            C0679r a = getFragmentManager().mo2225a();
            a.mo2177a((Fragment) this);
            if (z) {
                a.mo2195c();
            } else {
                a.mo2189b();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (this.mContainerId == 0) {
            z = true;
        } else {
            z = false;
        }
        this.mShowsDialog = z;
        if (bundle != null) {
            this.mStyle = bundle.getInt("android:style", 0);
            this.mTheme = bundle.getInt("android:theme", 0);
            this.mCancelable = bundle.getBoolean("android:cancelable", true);
            this.mShowsDialog = bundle.getBoolean("android:showsDialog", this.mShowsDialog);
            this.mBackStackId = bundle.getInt("android:backStackId", -1);
        }
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        if (!this.mShowsDialog) {
            return super.onGetLayoutInflater(bundle);
        }
        this.mDialog = onCreateDialog(bundle);
        if (this.mDialog == null) {
            return (LayoutInflater) this.mHost.f2344c.getSystemService("layout_inflater");
        }
        setupDialog(this.mDialog, this.mStyle);
        return (LayoutInflater) this.mDialog.getContext().getSystemService("layout_inflater");
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.mShowsDialog) {
            View view = getView();
            if (view != null) {
                if (view.getParent() == null) {
                    this.mDialog.setContentView(view);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                this.mDialog.setOwnerActivity(activity);
            }
            this.mDialog.setCancelable(this.mCancelable);
            this.mDialog.setOnCancelListener(this);
            this.mDialog.setOnDismissListener(this);
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("android:savedDialogState");
                if (bundle2 != null) {
                    this.mDialog.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.mDialog != null) {
            Bundle onSaveInstanceState = this.mDialog.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                bundle.putBundle("android:savedDialogState", onSaveInstanceState);
            }
        }
        if (this.mStyle != 0) {
            bundle.putInt("android:style", this.mStyle);
        }
        if (this.mTheme != 0) {
            bundle.putInt("android:theme", this.mTheme);
        }
        if (!this.mCancelable) {
            bundle.putBoolean("android:cancelable", this.mCancelable);
        }
        if (!this.mShowsDialog) {
            bundle.putBoolean("android:showsDialog", this.mShowsDialog);
        }
        if (this.mBackStackId != -1) {
            bundle.putInt("android:backStackId", this.mBackStackId);
        }
    }

    public void setStyle(int i, int i2) {
        this.mStyle = i;
        if (this.mStyle == 2 || this.mStyle == 3) {
            this.mTheme = 16973913;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    public void setupDialog(Dialog dialog, int i) {
        switch (i) {
            case 1:
            case 2:
                break;
            case 3:
                dialog.getWindow().addFlags(24);
                break;
            default:
                return;
        }
        dialog.requestWindowFeature(1);
    }

    public int show(C0679r rVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        rVar.mo2178a((Fragment) this, str);
        this.mViewDestroyed = false;
        this.mBackStackId = rVar.mo2189b();
        return this.mBackStackId;
    }

    public void showNow(C0654k kVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        C0679r a = kVar.mo2225a();
        a.mo2178a((Fragment) this, str);
        a.mo2198d();
    }

    public void show(C0654k kVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        C0679r a = kVar.mo2225a();
        a.mo2178a((Fragment) this, str);
        a.mo2189b();
    }
}

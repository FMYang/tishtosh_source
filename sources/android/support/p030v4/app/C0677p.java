package android.support.p030v4.app;

import android.os.Parcelable;
import android.support.p030v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.app.p */
public abstract class C0677p extends PagerAdapter {

    /* renamed from: a */
    private final C0654k f2420a;

    /* renamed from: b */
    private C0679r f2421b;

    /* renamed from: c */
    private Fragment f2422c;

    /* renamed from: a */
    public abstract Fragment mo2309a(int i);

    /* renamed from: b */
    public long mo2310b(int i) {
        return (long) i;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public C0677p(C0654k kVar) {
        this.f2420a = kVar;
    }

    public void finishUpdate(ViewGroup viewGroup) {
        if (this.f2421b != null) {
            this.f2421b.mo2200e();
            this.f2421b = null;
        }
    }

    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder sb = new StringBuilder("ViewPager with adapter ");
            sb.append(this);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }

    public boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static String m1930a(int i, long j) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f2421b == null) {
            this.f2421b = this.f2420a.mo2225a();
        }
        long b = mo2310b(i);
        Fragment a = this.f2420a.mo2224a(m1930a(viewGroup.getId(), b));
        if (a != null) {
            this.f2421b.mo2199e(a);
        } else {
            a = mo2309a(i);
            this.f2421b.mo2176a(viewGroup.getId(), a, m1930a(viewGroup.getId(), b));
        }
        if (a != this.f2422c) {
            a.setMenuVisibility(false);
            a.setUserVisibleHint(false);
        }
        return a;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.f2421b == null) {
            this.f2421b = this.f2420a.mo2225a();
        }
        this.f2421b.mo2197d((Fragment) obj);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f2422c) {
            if (this.f2422c != null) {
                this.f2422c.setMenuVisibility(false);
                this.f2422c.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f2422c = fragment;
        }
    }
}

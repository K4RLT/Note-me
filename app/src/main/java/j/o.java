package j;
import j.o;
import n.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import com.daren.scraply.R;
import java.util.Arrays;
import java.util.WeakHashMap;
import n.s0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: g, reason: collision with root package name */
    public static o f18670g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f18672a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f18673b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f18674c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18675d;
    public g9.n e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f18669f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final n f18671h = new com.google.android.gms.internal.ads.h0(6);

    public static synchronized o c() {
        o oVar;
        synchronized (o.class) {
            try {
                if (f18670g == null) {
                    f18670g = new o();
                }
                oVar = f18670g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (o.class) {
            n nVar = f18671h;
            nVar.getClass();
            int i10 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) nVar.c(Integer.valueOf(mode.hashCode() + i10));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        if (this.f18672a == null) {
            this.f18672a = new WeakHashMap();
        }
        s0 s0Var = (s0) this.f18672a.get(context);
        if (s0Var == null) {
            s0Var = new s0(0);
            this.f18672a.put(context, s0Var);
        }
        int i10 = s0Var.f20940w;
        if (i10 != 0 && i <= s0Var.f20938u[i10 - 1]) {
            s0Var.c(i, colorStateList);
            return;
        }
        if (i10 >= s0Var.f20938u.length) {
            int i11 = (i10 + 1) * 4;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 4;
            s0Var.f20938u = Arrays.copyOf(s0Var.f20938u, i14);
            s0Var.f20939v = Arrays.copyOf(s0Var.f20939v, i14);
        }
        s0Var.f20938u[i10] = i;
        s0Var.f20939v[i10] = colorStateList;
        s0Var.f20940w = i10 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable b(android.content.Context r7, int r8) {
        /*
            r6 = this;
            android.util.TypedValue r0 = r6.f18674c
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r6.f18674c = r0
        Lb:
            android.util.TypedValue r0 = r6.f18674c
            android.content.res.Resources r1 = r7.getResources()
            r2 = 1
            r1.getValue(r8, r0, r2)
            int r1 = r0.assetCookie
            long r1 = (long) r1
            r3 = 32
            long r1 = r1 << r3
            int r3 = r0.data
            long r3 = (long) r3
            long r1 = r1 | r3
            monitor-enter(r6)
            java.util.WeakHashMap r3 = r6.f18673b     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L48
            q r3 = (q) r3     // Catch: java.lang.Throwable -> L48
            r4 = 0
            if (r3 != 0) goto L2e
            monitor-exit(r6)
        L2c:
            r3 = r4
            goto L50
        L2e:
            java.lang.Object r5 = r3.b(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L48
            android.graphics.drawable.Drawable$ConstantState r5 = (android.graphics.drawable.Drawable.ConstantState) r5     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L4b
            android.content.res.Resources r3 = r7.getResources()     // Catch: java.lang.Throwable -> L48
            android.graphics.drawable.Drawable r3 = r5.newDrawable(r3)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r6)
            goto L50
        L48:
            r7 = move-exception
            goto Ld0
        L4b:
            r3.e(r1)     // Catch: java.lang.Throwable -> L48
        L4e:
            monitor-exit(r6)
            goto L2c
        L50:
            if (r3 == 0) goto L53
            return r3
        L53:
            g9.n r3 = r6.e
            if (r3 != 0) goto L59
        L57:
            r8 = r4
            goto L9c
        L59:
            r3 = 2131230736(0x7f080010, float:1.8077533E38)
            if (r8 != r3) goto L76
            android.graphics.drawable.LayerDrawable r8 = new android.graphics.drawable.LayerDrawable
            r3 = 2131230735(0x7f08000f, float:1.8077531E38)
            android.graphics.drawable.Drawable r3 = r6.d(r7, r3)
            r5 = 2131230737(0x7f080011, float:1.8077535E38)
            android.graphics.drawable.Drawable r5 = r6.d(r7, r5)
            android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[]{r3, r5}
            r8.<init>(r3)
            goto L9c
        L76:
            r3 = 2131230771(0x7f080033, float:1.8077604E38)
            if (r8 != r3) goto L83
            r8 = 2131165243(0x7f07003b, float:1.7944698E38)
            android.graphics.drawable.LayerDrawable r8 = g9.q(r6, r7, r8)
            goto L9c
        L83:
            r3 = 2131230770(0x7f080032, float:1.8077602E38)
            if (r8 != r3) goto L90
            r8 = 2131165244(0x7f07003c, float:1.79447E38)
            android.graphics.drawable.LayerDrawable r8 = g9.q(r6, r7, r8)
            goto L9c
        L90:
            r3 = 2131230772(0x7f080034, float:1.8077606E38)
            if (r8 != r3) goto L57
            r8 = 2131165245(0x7f07003d, float:1.7944702E38)
            android.graphics.drawable.LayerDrawable r8 = g9.q(r6, r7, r8)
        L9c:
            if (r8 == 0) goto Lcf
            int r0 = r0.changingConfigurations
            r8.setChangingConfigurations(r0)
            monitor-enter(r6)
            android.graphics.drawable.Drawable$ConstantState r0 = r8.getConstantState()     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto Lcb
            java.util.WeakHashMap r3 = r6.f18673b     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> Lbf
            q r3 = (q) r3     // Catch: java.lang.Throwable -> Lbf
            if (r3 != 0) goto Lc1
            q r3 = new q     // Catch: java.lang.Throwable -> Lbf
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lbf
            java.util.WeakHashMap r4 = r6.f18673b     // Catch: java.lang.Throwable -> Lbf
            r4.put(r7, r3)     // Catch: java.lang.Throwable -> Lbf
            goto Lc1
        Lbf:
            r7 = move-exception
            goto Lcd
        Lc1:
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Lbf
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lbf
            r3.d(r1, r7)     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r6)
            return r8
        Lcb:
            monitor-exit(r6)
            return r8
        Lcd:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lbf
            throw r7
        Lcf:
            return r8
        Ld0:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L48
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j.o.b(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, i);
    }

    public final synchronized Drawable e(Context context, int i) {
        Drawable b10;
        try {
            if (!this.f18675d) {
                this.f18675d = true;
                Drawable d2 = d(context, R.drawable.abc_vector_test);
                if (d2 == null || !"android.graphics.drawable.VectorDrawable".equals(d2.getClass().getName())) {
                    this.f18675d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            b10 = b(context, i);
            if (b10 == null) {
                b10 = context.getDrawable(i);
            }
            if (b10 != null) {
                b10 = h(context, i, b10);
            }
            if (b10 != null) {
                int[] iArr = k.f18646a;
                String name = b10.getClass().getName();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29 && i10 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                    int[] state = b10.getState();
                    if (state != null && state.length != 0) {
                        b10.setState(k.f18647b);
                        b10.setState(state);
                    }
                    b10.setState(k.f18646a);
                    b10.setState(state);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return b10;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        s0 s0Var;
        WeakHashMap weakHashMap = this.f18672a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (s0Var = (s0) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) s0Var.b(i);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            g9.n nVar = this.e;
            if (nVar != null) {
                colorStateList2 = nVar.s(context, i);
            }
            if (colorStateList2 != null) {
                a(context, i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable h(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.o.h(android.content.Context, int, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}

package r;
import l.a;
import l.b;
import l.c;
import t.z0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24166a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24167b;

    /* renamed from: c, reason: collision with root package name */
    public long f24168c = 0;

    /* renamed from: d, reason: collision with root package name */
    public EdgeEffect f24169d;
    public EdgeEffect e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f24170f;

    /* renamed from: g, reason: collision with root package name */
    public EdgeEffect f24171g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f24172h;
    public EdgeEffect i;

    /* renamed from: j, reason: collision with root package name */
    public EdgeEffect f24173j;

    /* renamed from: k, reason: collision with root package name */
    public EdgeEffect f24174k;

    public z(Context context, int i) {
        this.f24166a = context;
        this.f24167b = i;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        float f10;
        boolean z3 = false;
        if (edgeEffect == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            f10 = f3.b(edgeEffect);
        } else {
            f10 = 0.0f;
        }
        if (f10 == 0.0f) {
            z3 = true;
        }
        return !z3;
    }

    public final EdgeEffect a(z0 z0Var) {
        EdgeEffect d0Var;
        int i = Build.VERSION.SDK_INT;
        Context context = this.f24166a;
        if (i >= 31) {
            d0Var = f3.a(context);
        } else {
            d0Var = new d0(context);
        }
        d0Var.setColor(this.f24167b);
        if (!y2.c(this.f24168c, 0L)) {
            long j10 = this.f24168c;
            if (z0Var == z0.f25597u) {
                d0Var.setSize((int) (j10 >> 32), (int) (j10 & 4294967295L));
                return d0Var;
            }
            d0Var.setSize((int) (4294967295L & j10), (int) (j10 >> 32));
        }
        return d0Var;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect == null) {
            EdgeEffect a10 = a(z0.f25597u);
            this.e = a10;
            return a10;
        }
        return edgeEffect;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f24170f;
        if (edgeEffect == null) {
            EdgeEffect a10 = a(z0.f25598v);
            this.f24170f = a10;
            return a10;
        }
        return edgeEffect;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f24171g;
        if (edgeEffect == null) {
            EdgeEffect a10 = a(z0.f25598v);
            this.f24171g = a10;
            return a10;
        }
        return edgeEffect;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f24169d;
        if (edgeEffect == null) {
            EdgeEffect a10 = a(z0.f25597u);
            this.f24169d = a10;
            return a10;
        }
        return edgeEffect;
    }
}

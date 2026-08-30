package eb;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16341a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16342b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16343c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16344d;
    public final /* synthetic */ q0 e;

    public r0(q0 q0Var, String str, boolean z3) {
        this.e = q0Var;
        fa.y.e(str);
        this.f16341a = str;
        this.f16342b = z3;
    }

    public final void a(boolean z3) {
        SharedPreferences.Editor edit = this.e.D().edit();
        edit.putBoolean(this.f16341a, z3);
        edit.apply();
        this.f16344d = z3;
    }

    public final boolean b() {
        if (!this.f16343c) {
            this.f16343c = true;
            this.f16344d = this.e.D().getBoolean(this.f16341a, this.f16342b);
        }
        return this.f16344d;
    }
}

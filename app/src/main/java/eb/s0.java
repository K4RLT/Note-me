package eb;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16365a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16366b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16367c;

    /* renamed from: d, reason: collision with root package name */
    public long f16368d;
    public final /* synthetic */ q0 e;

    public s0(q0 q0Var, String str, long j10) {
        this.e = q0Var;
        fa.y.e(str);
        this.f16365a = str;
        this.f16366b = j10;
    }

    public final long a() {
        if (!this.f16367c) {
            this.f16367c = true;
            this.f16368d = this.e.D().getLong(this.f16365a, this.f16366b);
        }
        return this.f16368d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.e.D().edit();
        edit.putLong(this.f16365a, j10);
        edit.apply();
        this.f16368d = j10;
    }
}

package r5;

import android.content.Context;
import com.google.android.gms.internal.ads.iw0;
import pe.n;
import pe.w;

/* loaded from: classes.dex */
public final class h implements q5.b {
    public boolean A;

    /* renamed from: u, reason: collision with root package name */
    public final Context f24571u;

    /* renamed from: v, reason: collision with root package name */
    public final String f24572v;

    /* renamed from: w, reason: collision with root package name */
    public final iw0 f24573w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f24574x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f24575y;

    /* renamed from: z, reason: collision with root package name */
    public final n f24576z;

    public h(Context context, String str, iw0 iw0Var, boolean z3, boolean z9) {
        context.getClass();
        iw0Var.getClass();
        this.f24571u = context;
        this.f24572v = str;
        this.f24573w = iw0Var;
        this.f24574x = z3;
        this.f24575y = z9;
        this.f24576z = new n(new a1.c(27, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f24576z.f22701v != w.f22712a) {
            ((g) this.f24576z.getValue()).close();
        }
    }

    @Override // q5.b
    public final String getDatabaseName() {
        return this.f24572v;
    }

    @Override // q5.b
    public final void setWriteAheadLoggingEnabled(boolean z3) {
        if (this.f24576z.f22701v != w.f22712a) {
            ((g) this.f24576z.getValue()).setWriteAheadLoggingEnabled(z3);
        }
        this.A = z3;
    }

    @Override // q5.b
    public final c y() {
        return ((g) this.f24576z.getValue()).f(true);
    }
}

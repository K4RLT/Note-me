package ig;
import q.x;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class w implements Closeable {
    public final y A;
    public final w B;
    public final w C;
    public final w D;
    public final long E;
    public final long F;

    /* renamed from: u, reason: collision with root package name */
    public final a4.b f18596u;

    /* renamed from: v, reason: collision with root package name */
    public final r f18597v;

    /* renamed from: w, reason: collision with root package name */
    public final int f18598w;

    /* renamed from: x, reason: collision with root package name */
    public final String f18599x;

    /* renamed from: y, reason: collision with root package name */
    public final k f18600y;

    /* renamed from: z, reason: collision with root package name */
    public final l f18601z;

    public w(v vVar) {
        this.f18596u = vVar.f18586a;
        this.f18597v = vVar.f18587b;
        this.f18598w = vVar.f18588c;
        this.f18599x = vVar.f18589d;
        this.f18600y = vVar.e;
        f4.h hVar = vVar.f18590f;
        hVar.getClass();
        this.f18601z = new l(hVar);
        this.A = vVar.f18591g;
        this.B = vVar.f18592h;
        this.C = vVar.i;
        this.D = vVar.f18593j;
        this.E = vVar.f18594k;
        this.F = vVar.f18595l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        y yVar = this.A;
        if (yVar != null) {
            yVar.close();
        } else {
            x.o("response is not eligible for a body and must not be closed");
        }
    }

    public final String f(String str) {
        String c10 = this.f18601z.c(str);
        if (c10 != null) {
            return c10;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ig.v, java.lang.Object] */
    public final v j() {
        Object obj = new Object();
        obj.f18586a = this.f18596u;
        obj.f18587b = this.f18597v;
        obj.f18588c = this.f18598w;
        obj.f18589d = this.f18599x;
        obj.e = this.f18600y;
        obj.f18590f = this.f18601z.e();
        obj.f18591g = this.A;
        obj.f18592h = this.B;
        obj.i = this.C;
        obj.f18593j = this.D;
        obj.f18594k = this.E;
        obj.f18595l = this.F;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.f18597v + ", code=" + this.f18598w + ", message=" + this.f18599x + ", url=" + ((n) this.f18596u.f240c) + '}';
    }
}
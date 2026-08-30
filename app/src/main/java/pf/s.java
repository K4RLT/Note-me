package pf;
import l.a;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22786a;

    /* renamed from: b, reason: collision with root package name */
    public final j f22787b;

    /* renamed from: c, reason: collision with root package name */
    public final df.q f22788c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22789d;
    public final Throwable e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ s(java.lang.Object r9, pf.j r10, df.q r11, java.lang.Throwable r12, int r13) {
        /*
            r8 = this;
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto L7
            r4 = r1
            goto L8
        L7:
            r4 = r10
        L8:
            r10 = r13 & 4
            if (r10 == 0) goto Le
            r5 = r1
            goto Lf
        Le:
            r5 = r11
        Lf:
            r10 = r13 & 16
            if (r10 == 0) goto L15
            r7 = r1
            goto L16
        L15:
            r7 = r12
        L16:
            r6 = 0
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.s.<init>(java.lang.Object, pf.j, df.q, java.lang.Throwable, int):void");
    }

    public static s a(s sVar, j jVar, Throwable th, int i) {
        Object obj = sVar.f22786a;
        if ((i & 2) != 0) {
            jVar = sVar.f22787b;
        }
        j jVar2 = jVar;
        df.q qVar = sVar.f22788c;
        Object obj2 = sVar.f22789d;
        if ((i & 16) != 0) {
            th = sVar.e;
        }
        return new s(obj, jVar2, qVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (kotlin.jvm.internal.a(this.f22786a, sVar.f22786a) && kotlin.jvm.internal.a(this.f22787b, sVar.f22787b) && kotlin.jvm.internal.a(this.f22788c, sVar.f22788c) && kotlin.jvm.internal.a(this.f22789d, sVar.f22789d) && kotlin.jvm.internal.a(this.e, sVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        Object obj = this.f22786a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        j jVar = this.f22787b;
        if (jVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = jVar.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        df.q qVar = this.f22788c;
        if (qVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = qVar.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Object obj2 = this.f22789d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return i13 + i;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f22786a + ", cancelHandler=" + this.f22787b + ", onCancellation=" + this.f22788c + ", idempotentResume=" + this.f22789d + ", cancelCause=" + this.e + ')';
    }

    public s(Object obj, j jVar, df.q qVar, Object obj2, Throwable th) {
        this.f22786a = obj;
        this.f22787b = jVar;
        this.f22788c = qVar;
        this.f22789d = obj2;
        this.e = th;
    }
}

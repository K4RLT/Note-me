package vd;
import l.a;
import p.a;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27603a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27604b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27605c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27606d;
    public final j e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27607f;

    /* renamed from: g, reason: collision with root package name */
    public final String f27608g;

    public i0(String str, String str2, int i, long j10, j jVar, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        this.f27603a = str;
        this.f27604b = str2;
        this.f27605c = i;
        this.f27606d = j10;
        this.e = jVar;
        this.f27607f = str3;
        this.f27608g = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i0) {
                i0 i0Var = (i0) obj;
                if (!kotlin.jvm.internal.a(this.f27603a, i0Var.f27603a) || !kotlin.jvm.internal.a(this.f27604b, i0Var.f27604b) || this.f27605c != i0Var.f27605c || this.f27606d != i0Var.f27606d || !this.e.equals(i0Var.e) || !this.f27607f.equals(i0Var.f27607f) || !kotlin.jvm.internal.a(this.f27608g, i0Var.f27608g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f27608g.hashCode() + g3.a.e(this.f27607f, (this.e.hashCode() + a.d(this.f27606d, a.b(this.f27605c, g3.a.e(this.f27604b, this.f27603a.hashCode() * 31, 31), 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInfo(sessionId=");
        sb2.append(this.f27603a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f27604b);
        sb2.append(", sessionIndex=");
        sb2.append(this.f27605c);
        sb2.append(", eventTimestampUs=");
        sb2.append(this.f27606d);
        sb2.append(", dataCollectionStatus=");
        sb2.append(this.e);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f27607f);
        sb2.append(", firebaseAuthenticationToken=");
        return a.n(sb2, this.f27608g, ')');
    }
}

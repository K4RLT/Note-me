package n8;
import q.h;

import android.util.Base64;
import j.i0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f21181a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f21182b;

    /* renamed from: c, reason: collision with root package name */
    public final k8.d f21183c;

    public i(String str, byte[] bArr, k8.d dVar) {
        this.f21181a = str;
        this.f21182b = bArr;
        this.f21183c = dVar;
    }

    public static i0 a() {
        i0 i0Var = new i0(9, false);
        i0Var.f18638x = k8.d.f19626u;
        return i0Var;
    }

    public final i b(k8.d dVar) {
        i0 a10 = a();
        a10.E(this.f21181a);
        if (dVar != null) {
            a10.f18638x = dVar;
            a10.f18637w = this.f21182b;
            return a10.d();
        }
        g5.h("Null priority");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f21181a.equals(iVar.f21181a) && Arrays.equals(this.f21182b, iVar.f21182b) && this.f21183c.equals(iVar.f21183c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f21181a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21182b)) * 1000003) ^ this.f21183c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f21182b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f21181a);
        sb2.append(", ");
        sb2.append(this.f21183c);
        sb2.append(", ");
        return a5.a.k(sb2, encodeToString, ")");
    }
}

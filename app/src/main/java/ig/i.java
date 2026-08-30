package ig;
import a0.a;
import f.e;
import f.i;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class i {
    public static final i e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f18507f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18508a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18509b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f18510c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f18511d;

    static {
        f fVar = f.f18491q;
        f fVar2 = f.f18492r;
        f fVar3 = f.f18493s;
        f fVar4 = f.f18494t;
        f fVar5 = f.f18495u;
        f fVar6 = f.f18485k;
        f fVar7 = f.f18487m;
        f fVar8 = f.f18486l;
        f fVar9 = f.f18488n;
        f fVar10 = f.f18490p;
        f fVar11 = f.f18489o;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11};
        f[] fVarArr2 = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, f.i, f.f18484j, f.f18482g, f.f18483h, e, f.f18481f, f.f18480d};
        h hVar = new h(true);
        hVar.a(fVarArr);
        a0 a0Var = a0.TLS_1_3;
        a0 a0Var2 = a0.TLS_1_2;
        hVar.c(a0Var, a0Var2);
        hVar.f18504b = true;
        h hVar2 = new h(true);
        hVar2.a(fVarArr2);
        a0 a0Var3 = a0.TLS_1_1;
        a0 a0Var4 = a0.TLS_1_0;
        hVar2.c(a0Var, a0Var2, a0Var3, a0Var4);
        hVar2.f18504b = true;
        e = new i(hVar2);
        h hVar3 = new h(true);
        hVar3.a(fVarArr2);
        hVar3.c(a0Var4);
        hVar3.f18504b = true;
        f18507f = new i(new h(false));
    }

    public i(h hVar) {
        this.f18508a = hVar.f18503a;
        this.f18510c = (String[]) hVar.f18505c;
        this.f18511d = (String[]) hVar.f18506d;
        this.f18509b = hVar.f18504b;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (this.f18508a) {
            String[] strArr = this.f18511d;
            if (strArr == null || jg.b.o(jg.b.f19203f, strArr, sSLSocket.getEnabledProtocols())) {
                String[] strArr2 = this.f18510c;
                if (strArr2 != null && !jg.b.o(f.f18478b, strArr2, sSLSocket.getEnabledCipherSuites())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (obj != this) {
                i iVar = (i) obj;
                boolean z3 = iVar.f18508a;
                boolean z9 = this.f18508a;
                if (z9 == z3) {
                    if (z9) {
                        if (!Arrays.equals(this.f18510c, iVar.f18510c) || !Arrays.equals(this.f18511d, iVar.f18511d) || this.f18509b != iVar.f18509b) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f18508a) {
            return ((((527 + Arrays.hashCode(this.f18510c)) * 31) + Arrays.hashCode(this.f18511d)) * 31) + (!this.f18509b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        if (!this.f18508a) {
            return "ConnectionSpec()";
        }
        String str2 = "[all enabled]";
        String[] strArr = this.f18510c;
        if (strArr == null) {
            str = "[all enabled]";
        } else {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str3 : strArr) {
                arrayList.add(a(str3));
            }
            str = Collections.unmodifiableList(arrayList).toString();
        }
        String[] strArr2 = this.f18511d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str4 : strArr2) {
                arrayList2.add(a(str4));
            }
            str2 = Collections.unmodifiableList(arrayList2).toString();
        }
        StringBuilder q10 = a.q("ConnectionSpec(cipherSuites=", str, ", tlsVersions=", str2, ", supportsTlsExtensions=");
        q10.append(this.f18509b);
        q10.append(")");
        return q10.toString();
    }
}

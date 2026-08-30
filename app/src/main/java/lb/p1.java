package lb;
import a.a;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c7.a f20232b = new c7.a("VerifySliceTaskHandler", 5);

    /* renamed from: a, reason: collision with root package name */
    public final v f20233a;

    public p1(v vVar) {
        this.f20233a = vVar;
    }

    public final void a(o1 o1Var) {
        String str = (String) o1Var.f13135v;
        String str2 = (String) o1Var.f13135v;
        String str3 = o1Var.f20223y;
        int i = o1Var.f13134u;
        File l10 = this.f20233a.l(o1Var.f20221w, o1Var.f20222x, str2, str3);
        if (l10.exists()) {
            try {
                v vVar = this.f20233a;
                String str4 = o1Var.f20223y;
                int i10 = o1Var.f20221w;
                long j10 = o1Var.f20222x;
                vVar.getClass();
                File file = new File(new File(new File(vVar.d(str, j10, i10), "_slices"), "_metadata"), str4);
                if (file.exists()) {
                    try {
                        if (a(a(l10, file)).equals(o1Var.f20224z)) {
                            f20232b.e("Verification of slice %s of pack %s successful.", str4, str);
                            File m4 = this.f20233a.m(o1Var.f20221w, o1Var.f20222x, (String) o1Var.f13135v, o1Var.f20223y);
                            if (!m4.exists()) {
                                m4.mkdirs();
                            }
                            if (l10.renameTo(m4)) {
                                return;
                            } else {
                                throw new k0(a.k("Failed to move slice ", str3, " after verification."), i);
                            }
                        }
                        throw new k0(a.k("Verification failed for slice ", str4, "."), i);
                    } catch (IOException e) {
                        throw new k0(a.k("Could not digest file during verification for slice ", str3, "."), e, i);
                    } catch (NoSuchAlgorithmException e8) {
                        throw new k0("SHA256 algorithm not supported.", e8, i);
                    }
                }
                throw new k0("Cannot find metadata files for slice " + str4 + ".", i);
            } catch (IOException e10) {
                throw new k0(a.k("Could not reconstruct slice archive during verification for slice ", str3, "."), e10, i);
            }
        }
        throw new k0(a.k("Cannot find unverified files for slice ", str3, "."), i);
    }
}

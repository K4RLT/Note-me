package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class fq0 {
    public static final String a(byte[] bArr, byte[] bArr2, String str, zd0 zd0Var) {
        com.google.android.gms.internal.mlkit_vision_digital_ink.gw gwVar;
        if (str != null) {
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 11));
                    try {
                        wm1 wm1Var = wm1.f12302a;
                        int i = em1.f5727a;
                        nh1 E = nh1.E(byteArrayInputStream, wm1.f12303b);
                        byteArrayInputStream.close();
                        gwVar = com.google.android.gms.internal.mlkit_vision_digital_ink.gw.B(E);
                    } catch (Throwable th) {
                        byteArrayInputStream.close();
                        throw th;
                    }
                } catch (IOException unused) {
                    throw new GeneralSecurityException("Parse keyset failed");
                }
            } catch (GeneralSecurityException e) {
                k9.a0.k("Failed to get keysethandle".concat(e.toString()));
                f9.k.C.f16817h.d("CryptoUtils.getHandle", e);
                gwVar = null;
            }
            if (gwVar != null) {
                try {
                    xy.zza();
                    byte[] a10 = ((o91) gwVar.J(ay0.E, o91.class)).a(bArr, bArr2);
                    zd0Var.f13137a.put("ds", "1");
                    return new String(a10, StandardCharsets.UTF_8);
                } catch (UnsupportedOperationException | GeneralSecurityException e8) {
                    k9.a0.k("Failed to decrypt ".concat(e8.toString()));
                    f9.k.C.f16817h.d("CryptoUtils.decrypt", e8);
                    zd0Var.f13137a.put("dsf", e8.toString());
                }
            }
        }
        return null;
    }
}

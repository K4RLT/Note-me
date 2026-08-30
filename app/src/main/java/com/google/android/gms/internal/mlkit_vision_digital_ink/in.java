package com.google.android.gms.internal.mlkit_vision_digital_ink;

import com.google.android.gms.internal.ads.rm1;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class in implements mo {

    /* renamed from: b, reason: collision with root package name */
    public static final bn f14475b;

    /* renamed from: a, reason: collision with root package name */
    public final nn f14476a;

    static {
        bn bnVar = bn.f14099b;
        oo ooVar = oo.f14756c;
        f14475b = bn.f14100c;
    }

    public in(nn nnVar) {
        this.f14476a = nnVar;
    }

    public static final void b(nn nnVar) {
        if (nnVar != null && !nn.s(nnVar, true)) {
            androidx.datastore.preferences.protobuf.s1.u(new xo().getMessage());
        }
    }

    public final nn a(InputStream inputStream, bn bnVar) {
        rm1 vmVar;
        if (inputStream == null) {
            byte[] bArr = vn.f15138b;
            int length = bArr.length;
            vmVar = rm1.j(bArr, 0);
        } else {
            vmVar = new vm(inputStream);
        }
        int i = nn.zzd;
        nn i10 = this.f14476a.i();
        try {
            ro a10 = oo.f14756c.a(i10.getClass());
            androidx.datastore.preferences.protobuf.i iVar = (androidx.datastore.preferences.protobuf.i) vmVar.f10247c;
            if (iVar == null) {
                iVar = new androidx.datastore.preferences.protobuf.i(vmVar, (byte) 0);
            }
            a10.i(i10, iVar, bnVar);
            a10.b(i10);
            vmVar.a0(0);
            return i10;
        } catch (xn e) {
            if (e.f15243u) {
                throw new IOException(e.getMessage(), e);
            }
            throw e;
        } catch (xo e8) {
            androidx.datastore.preferences.protobuf.s1.u(e8.getMessage());
            return null;
        } catch (IOException e10) {
            if (e10.getCause() instanceof xn) {
                throw ((xn) e10.getCause());
            }
            throw new IOException(e10.getMessage(), e10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof xn) {
                throw ((xn) e11.getCause());
            }
            throw e11;
        }
    }
}

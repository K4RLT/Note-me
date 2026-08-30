package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class ys implements m2 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15300u;

    public /* synthetic */ ys(int i) {
        this.f15300u = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.m2
    public final Object l(Object obj) {
        switch (this.f15300u) {
            case 0:
                return (m) obj;
            case 1:
                return new lt(0, (m) obj);
            case 2:
                m mVar = (m) obj;
                if (mVar != null) {
                    dt.b(mVar);
                }
                return mVar;
            case 3:
                return null;
            case 4:
                m mVar2 = (m) obj;
                mVar2.getClass();
                return mVar2;
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    return ou.f14763w;
                }
                return ou.f14764x;
            case 6:
                tr trVar = (tr) obj;
                if (trVar == null) {
                    return j2.f14494u;
                }
                return new s2(trVar);
            case 7:
                return new hx(obj, null, true);
            case 8:
                return new hx(null, (Exception) obj, false);
            case 9:
                return new hx(obj, null, true);
            case 10:
                return new hx(null, (Exception) obj, false);
            case 11:
                return Boolean.TRUE;
            case 12:
                b6.u.C = true;
                return null;
            case 13:
                zr zrVar = (zr) ((cs) obj).g();
                nn nnVar = zrVar.f14429u;
                if (!nnVar.o()) {
                    zrVar.f14430v = nnVar.i();
                    return (cs) zrVar.i();
                }
                q.x.n("Default instance must be immutable.");
                return null;
            case 14:
                zr zrVar2 = (zr) ((cs) obj).g();
                zrVar2.b();
                cs.z((cs) zrVar2.f14430v);
                return (cs) zrVar2.i();
            case 15:
                return Boolean.TRUE;
            case 16:
                return Boolean.TRUE;
            case 17:
                return Boolean.FALSE;
            case 18:
                return Boolean.FALSE;
            case 19:
                return Boolean.TRUE;
            case 20:
                return Boolean.FALSE;
            case com.google.android.gms.internal.ads.gl.zzm /* 21 */:
                cx.e("Failed to commit migration metadata to disk");
                new Exception("Migration to DownloadTransform failed.", (IOException) obj);
                return Boolean.FALSE;
            case 22:
                return Boolean.TRUE;
            case 23:
                return Boolean.FALSE;
            case 24:
                return Boolean.TRUE;
            case 25:
                cx.e("Failed to commit migration metadata to disk");
                new Exception("Migration to ChecksumOnly failed.", (IOException) obj);
                return Boolean.FALSE;
            case 26:
                ps psVar = (ps) ((rs) obj).g();
                nn nnVar2 = psVar.f14429u;
                if (!nnVar2.o()) {
                    psVar.f14430v = nnVar2.i();
                    return (rs) psVar.i();
                }
                q.x.n("Default instance must be immutable.");
                return null;
            default:
                return Boolean.TRUE;
        }
    }
}

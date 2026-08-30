package ke;

import android.util.Log;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ab;
import com.google.android.gms.internal.mlkit_vision_digital_ink.i2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ia;
import com.google.android.gms.internal.mlkit_vision_digital_ink.n5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.na;
import com.google.android.gms.internal.mlkit_vision_digital_ink.r0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.sl;
import com.google.android.gms.internal.mlkit_vision_digital_ink.w9;
import com.google.android.gms.internal.mlkit_vision_digital_ink.y2;
import ib.h;
import ib.o;
import ra.e;

/* loaded from: classes.dex */
public final class a extends sl {
    public final o e(je.b bVar) {
        Log.i("MddModelManager", "getDownloadedFilesForModel()");
        y2 b10 = y2.b(i2.f14454a);
        r0 r0Var = new r0(this, 4, bVar);
        na naVar = this.f14977f;
        ab abVar = this.f14974b;
        w9 q10 = n5.q(naVar, r0Var, abVar);
        h hVar = new h();
        q10.g(new iv1(hVar, 4, q10), ia.f14473u);
        return hVar.f18363a.n(abVar, new e(19, this, bVar, b10));
    }
}

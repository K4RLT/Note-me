package com.google.android.gms.internal.mlkit_vision_digital_ink;
import b6.u;
import q1.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.i60;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class dv implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f14225b;

    public /* synthetic */ dv(u uVar, int i) {
        this.f14224a = i;
        this.f14225b = uVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        int i = this.f14224a;
        int i10 = 0;
        int i11 = 3;
        u uVar = this.f14225b;
        switch (i) {
            case 0:
                return ((qu) uVar.f1783w).zzb();
            case 1:
                ya p10 = ((wv) uVar.f1785y).p();
                dv dvVar = new dv(uVar, i10);
                int i12 = g2.f14354a;
                return n5.q(p10, new r0(b(), i11, dvVar), (Executor) uVar.A);
            case 2:
                if (!((Boolean) obj).booleanValue()) {
                    cx.m("%s Clearing MDD since FilesMetadata failed or needs migration.");
                    return uVar.f();
                }
                return va.f15125v;
            case 3:
                if (!((Boolean) obj).booleanValue()) {
                    cx.m("%s Clearing MDD since FileManager failed or needs migration.");
                    return uVar.f();
                }
                return va.f15125v;
            case 4:
                SharedPreferences d2 = nw.d((Context) uVar.f1781u, "gms_icing_mdd_manager_metadata", (q2) uVar.f1786z);
                if (!d2.getBoolean("mdd_migrated_to_offroad", false)) {
                    cx.a("%s Clearing MDD as device isn't migrated to offroad.", "MDDManager");
                    w9 f10 = uVar.f();
                    rl rlVar = new rl(4, d2);
                    Executor executor = (Executor) uVar.A;
                    int i13 = g2.f14354a;
                    return n5.p(f10, new f2(b(), i10, rlVar), executor);
                }
                return va.f15125v;
            case 5:
                i60 i60Var = (i60) uVar.f1784x;
                Context context = (Context) i60Var.f7023a;
                SharedPreferences d10 = nw.d(context, "gms_icing_mdd_shared_file_manager_metadata", (q2) i60Var.f7029h);
                if (d10.contains("migrated_to_new_file_key")) {
                    if (d10.getBoolean("migrated_to_new_file_key", false)) {
                        gn.e(context);
                    }
                    d10.edit().remove("migrated_to_new_file_key").commit();
                }
                va m4 = n5.m(Boolean.TRUE);
                dv dvVar2 = new dv(uVar, i11);
                int i14 = g2.f14354a;
                return n5.q(m4, new r0(b(), i11, dvVar2), (Executor) uVar.A);
            case 6:
                ya j10 = ((wv) uVar.f1785y).j();
                dv dvVar3 = new dv(uVar, 2);
                int i15 = g2.f14354a;
                return n5.q(j10, new r0(b(), i11, dvVar3), (Executor) uVar.A);
            default:
                return ((qu) uVar.f1783w).b();
        }
    }
}

package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.internal.ads.wd0;

/* loaded from: classes.dex */
public final class zv implements wv {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15362a;

    /* renamed from: b, reason: collision with root package name */
    public final q2 f15363b;

    /* renamed from: c, reason: collision with root package name */
    public final ss f15364c;

    public zv(Context context, kw kwVar, q2 q2Var, ss ssVar) {
        this.f15362a = context;
        this.f15363b = q2Var;
        this.f15364c = ssVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.wv
    public final ya a(ls lsVar, os osVar) {
        Context context = this.f15362a;
        String s10 = gn.s(lsVar, context);
        SharedPreferences.Editor edit = nw.d(context, "gms_icing_mdd_shared_files", this.f15363b).edit();
        edit.putString(s10, Base64.encodeToString(osVar.d(), 3));
        return n5.m(Boolean.valueOf(edit.commit()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.wv
    public final ya b(n4 n4Var) {
        q2 q2Var = this.f15363b;
        Context context = this.f15362a;
        SharedPreferences d2 = nw.d(context, "gms_icing_mdd_shared_files", q2Var);
        j4 j4Var = new j4(4);
        k5 k3 = n4Var.k();
        while (k3.hasNext()) {
            ls lsVar = (ls) k3.next();
            os osVar = (os) nw.o(d2, gn.s(lsVar, context), os.y());
            if (osVar != null) {
                j4Var.a(lsVar, osVar);
            }
        }
        return n5.m(j4Var.c(false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.wv
    public final ya c(ls lsVar) {
        int i = n4.f14693w;
        ya b10 = b(new h5(lsVar));
        mv mvVar = new mv(lsVar, 1);
        int i10 = g2.f14354a;
        return n5.p(b10, new f2(q1.b(), 0, mvVar), ia.f14473u);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.wv
    public final ya j() {
        String n10;
        String n11;
        String n12;
        String n13;
        int i;
        String n14;
        String n15;
        SharedPreferences sharedPreferences;
        ls m4;
        os osVar;
        zv zvVar = this;
        Context context = zvVar.f15362a;
        boolean z3 = false;
        boolean z9 = context.getSharedPreferences("gms_icing_mdd_migrations", 0).getBoolean("migrated_to_new_file_key", false);
        ss ssVar = zvVar.f15364c;
        int i10 = 2;
        if (z9) {
            ssVar.getClass();
            av a10 = av.a(2);
            int i11 = a10.f14040u;
            av q10 = gn.q(context);
            int i12 = q10.f14040u;
            int i13 = 1;
            if (i11 == i12) {
                z3 = true;
            } else if (i11 < i12) {
                cx.g("%s Cannot migrate back from value %s to %s. Clear everything!", "SharedFilesMetadata", q10, a10);
                new Exception(a5.a.h("Downgraded file key from ", String.valueOf(q10), " to ", String.valueOf(a10), "."));
                gn.p(context, a10);
            } else {
                int i14 = i12 + 1;
                while (i14 <= i11) {
                    try {
                        av a11 = av.a(i14);
                        int ordinal = a11.ordinal();
                        q2 q2Var = zvVar.f15363b;
                        if (ordinal != i13) {
                            if (ordinal == i10) {
                                cx.a("%s: Starting migration to dedup on checksum only", "SharedFilesMetadata");
                                SharedPreferences d2 = nw.d(context, "gms_icing_mdd_shared_files", q2Var);
                                SharedPreferences.Editor edit = d2.edit();
                                for (String str : d2.getAll().keySet()) {
                                    int i15 = i10;
                                    try {
                                        m4 = gn.m(context, str);
                                        osVar = (os) nw.o(d2, str, os.y());
                                    } catch (jx unused) {
                                        sharedPreferences = d2;
                                        cx.i("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", str);
                                        edit.remove(str);
                                    }
                                    if (osVar == null) {
                                        cx.f("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                        edit.remove(str);
                                        i10 = i15;
                                    } else {
                                        edit.remove(str);
                                        String d10 = gn.d(m4);
                                        sharedPreferences = d2;
                                        edit.putString(d10, Base64.encodeToString(osVar.d(), 3));
                                        d2 = sharedPreferences;
                                        i10 = i15;
                                    }
                                }
                                i = i10;
                                if (!edit.commit()) {
                                    cx.e("Failed to commit migration metadata to disk");
                                    new Exception("Migrate to ChecksumOnly failed.");
                                    if (gn.q(context).f14040u != i11 && !gn.p(context, a10)) {
                                        n14 = wd0.n("Failed to commit migration version to disk. Fail to set target version to ", String.valueOf(a10), ".");
                                        cx.e(n14);
                                        n15 = wd0.n("Fail to set target version ", String.valueOf(a10), ".");
                                        new Exception(n15);
                                    }
                                    z3 = false;
                                }
                                gn.p(context, av.a(i14));
                                i14++;
                                zvVar = this;
                                i10 = i;
                                i13 = 1;
                            } else {
                                throw new UnsupportedOperationException("Upgrade to version " + a11.name() + "not supported!");
                            }
                        } else {
                            i = i10;
                            cx.a("%s: Starting migration to add download transform", "SharedFilesMetadata");
                            SharedPreferences d11 = nw.d(context, "gms_icing_mdd_shared_files", q2Var);
                            SharedPreferences.Editor edit2 = d11.edit();
                            for (String str2 : d11.getAll().keySet()) {
                                try {
                                    ls m10 = gn.m(context, str2);
                                    os osVar2 = (os) nw.o(d11, str2, os.y());
                                    if (osVar2 == null) {
                                        cx.f("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                        edit2.remove(str2);
                                    } else {
                                        edit2.remove(str2);
                                        edit2.putString(gn.l(m10), Base64.encodeToString(osVar2.d(), 3));
                                    }
                                } catch (jx unused2) {
                                    cx.i("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", str2);
                                    edit2.remove(str2);
                                }
                            }
                            if (!edit2.commit()) {
                                cx.e("Failed to commit migration metadata to disk");
                                new Exception("Migrate to DownloadTransform failed.");
                                if (gn.q(context).f14040u != i11) {
                                    n14 = wd0.n("Failed to commit migration version to disk. Fail to set target version to ", String.valueOf(a10), ".");
                                    cx.e(n14);
                                    n15 = wd0.n("Fail to set target version ", String.valueOf(a10), ".");
                                    new Exception(n15);
                                }
                                z3 = false;
                            }
                            gn.p(context, av.a(i14));
                            i14++;
                            zvVar = this;
                            i10 = i;
                            i13 = 1;
                        }
                    } catch (Throwable th) {
                        if (gn.q(context).f14040u != i11 && !gn.p(context, a10)) {
                            n12 = wd0.n("Failed to commit migration version to disk. Fail to set target version to ", String.valueOf(a10), ".");
                            cx.e(n12);
                            n13 = wd0.n("Fail to set target version ", String.valueOf(a10), ".");
                            new Exception(n13);
                        }
                        throw th;
                    }
                }
                if (gn.q(context).f14040u != i11 && !gn.p(context, a10)) {
                    n10 = wd0.n("Failed to commit migration version to disk. Fail to set target version to ", String.valueOf(a10), ".");
                    cx.e(n10);
                    n11 = wd0.n("Fail to set target version ", String.valueOf(a10), ".");
                    new Exception(n11);
                }
                z3 = true;
            }
            return n5.m(Boolean.valueOf(z3));
        }
        cx.a("%s Device isn't migrated to new file key, clear and set migration.", "SharedFilesMetadata");
        gn.e(context);
        ssVar.getClass();
        gn.p(context, av.a(2));
        return n5.m(Boolean.FALSE);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.wv
    public final ya p() {
        nw.d(this.f15362a, "gms_icing_mdd_shared_files", this.f15363b).edit().clear().commit();
        return va.f15125v;
    }
}

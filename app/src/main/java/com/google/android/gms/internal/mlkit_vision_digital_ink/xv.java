package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class xv implements qu {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15253a;

    /* renamed from: b, reason: collision with root package name */
    public final q2 f15254b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f15255c;

    public xv(Context context, q2 q2Var, Executor executor) {
        this.f15253a = context;
        this.f15254b = q2Var;
        this.f15255c = executor;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya a(fs fsVar) {
        return n5.m((tr) nw.o(nw.d(this.f15253a, "gms_icing_mdd_groups", this.f15254b), Base64.encodeToString(fsVar.d(), 3), tr.O()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya b() {
        return va.f15125v;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya c(tr trVar) {
        Instant now;
        long epochMilli;
        cx.c("%s: Adding file group %s", "SharedPreferencesFileGroupsMetadata", trVar.P());
        now = Instant.now();
        epochMilli = now.toEpochMilli();
        tr j10 = f7.j(trVar, trVar.F() + (epochMilli / 1000));
        ArrayList arrayList = new ArrayList();
        arrayList.add(j10);
        File g8 = g();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(g8, true);
            try {
                ByteBuffer f10 = tl.f(arrayList);
                if (f10 != null) {
                    fileOutputStream.getChannel().write(f10);
                }
                fileOutputStream.close();
                return n5.m(Boolean.TRUE);
            } catch (IOException unused) {
                cx.e("IOException occurred while writing file groups.");
                return n5.m(Boolean.FALSE);
            }
        } catch (FileNotFoundException unused2) {
            cx.f("File %s not found while writing.", g8.getAbsolutePath());
            return n5.m(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya d(fs fsVar) {
        return n5.m(Boolean.valueOf(nw.d(this.f15253a, "gms_icing_mdd_groups", this.f15254b).edit().remove(Base64.encodeToString(fsVar.d(), 3)).commit()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya e(fs fsVar, tr trVar) {
        String encodeToString = Base64.encodeToString(fsVar.d(), 3);
        SharedPreferences.Editor edit = nw.d(this.f15253a, "gms_icing_mdd_groups", this.f15254b).edit();
        edit.putString(encodeToString, Base64.encodeToString(trVar.d(), 3));
        return n5.m(Boolean.valueOf(edit.commit()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya f(fs fsVar) {
        return n5.m((gs) nw.o(nw.d(this.f15253a, "gms_icing_mdd_group_key_properties", this.f15254b), Base64.encodeToString(fsVar.d(), 3), gs.u()));
    }

    public final File g() {
        q2 q2Var = this.f15254b;
        String str = "gms_icing_mdd_garbage_file";
        if (q2Var != null && q2Var.c()) {
            str = "gms_icing_mdd_garbage_file".concat((String) q2Var.a());
        }
        return new File(this.f15253a.getFilesDir(), str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya zzb() {
        Context context = this.f15253a;
        q2 q2Var = this.f15254b;
        nw.d(context, "gms_icing_mdd_groups", q2Var).edit().clear().commit();
        nw.d(context, "gms_icing_mdd_group_key_properties", q2Var).edit().clear().commit();
        g().delete();
        return va.f15125v;
    }
}

package de;
import a.a;
import l.a;

import android.content.Context;
import android.util.Log;
import b0.e1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.i8;
import fa.y;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import wa.h8;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final ca.d f15849a;

    static {
        ca.d dVar = new ca.d("vision.barcode", 1L);
        ca.d dVar2 = new ca.d("vision.custom.ica", 1L);
        ca.d dVar3 = new ca.d("vision.face", 1L);
        ca.d dVar4 = new ca.d("vision.ica", 1L);
        ca.d dVar5 = new ca.d("vision.ocr", 1L);
        ca.d dVar6 = new ca.d("mlkit.langid", 1L);
        ca.d dVar7 = new ca.d("mlkit.nlclassifier", 1L);
        ca.d dVar8 = new ca.d("tflite_dynamite", 1L);
        ca.d dVar9 = new ca.d("mlkit.barcode.ui", 1L);
        ca.d dVar10 = new ca.d("mlkit.smartreply", 1L);
        f15849a = new ca.d("mlkit.segmentation.subject", 1L);
        e1 e1Var = new e1(13, (byte) 0);
        e1Var.l("barcode", dVar);
        e1Var.l("custom_ica", dVar2);
        e1Var.l("face", dVar3);
        e1Var.l("ica", dVar4);
        e1Var.l("ocr", dVar5);
        e1Var.l("langid", dVar6);
        e1Var.l("nlclassifier", dVar7);
        e1Var.l("tflite_dynamite", dVar8);
        e1Var.l("barcode_ui", dVar9);
        e1Var.l("smart_reply", dVar10);
        va.e eVar = (va.e) e1Var.f1181d;
        if (eVar == null) {
            va.a(e1Var.f1179b, (Object[]) e1Var.f1180c, e1Var);
            va.e eVar2 = (va.e) e1Var.f1181d;
            if (eVar2 == null) {
                e1 e1Var2 = new e1(13, (byte) 0);
                e1Var2.l("com.google.android.gms.vision.barcode", dVar);
                e1Var2.l("com.google.android.gms.vision.custom.ica", dVar2);
                e1Var2.l("com.google.android.gms.vision.face", dVar3);
                e1Var2.l("com.google.android.gms.vision.ica", dVar4);
                e1Var2.l("com.google.android.gms.vision.ocr", dVar5);
                e1Var2.l("com.google.android.gms.mlkit.langid", dVar6);
                e1Var2.l("com.google.android.gms.mlkit.nlclassifier", dVar7);
                e1Var2.l("com.google.android.gms.tflite_dynamite", dVar8);
                e1Var2.l("com.google.android.gms.mlkit_smartreply", dVar10);
                va.e eVar3 = (va.e) e1Var2.f1181d;
                if (eVar3 == null) {
                    va.a(e1Var2.f1179b, (Object[]) e1Var2.f1180c, e1Var2);
                    va.e eVar4 = (va.e) e1Var2.f1181d;
                    if (eVar4 == null) {
                        return;
                    } else {
                        throw eVar4.a();
                    }
                }
                throw eVar3.a();
            }
            throw eVar2.a();
        }
        throw eVar.a();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [da.f, ja.f] */
    public static boolean a(Context context, ca.d[] dVarArr) {
        try {
            ib.o d2 = new da.f(context, ja.f.C, da.b.f15818a, da.e.f15820b).d(new p(dVarArr, 1));
            ed.e eVar = new ed.e(12);
            d2.getClass();
            d2.e(ib.i.f18364a, eVar);
            return ((ia.a) h8.a(d2)).f18358u;
        } catch (InterruptedException | ExecutionException e) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e);
            return false;
        }
    }

    public static void b(Context context, ca.d[] dVarArr) {
        ib.o c10;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p(dVarArr, 0));
        y.a("APIs must not be empty.", !arrayList.isEmpty());
        da.f fVar = new da.f(context, ja.f.C, da.b.f15818a, da.e.f15820b);
        ja.a a10 = ja.a(arrayList, true);
        if (a10.f19093u.isEmpty()) {
            c10 = h8.e(new ia.c(0, false));
        } else {
            i8 i8Var = new i8();
            i8Var.e = new ca.d[]{sa.b.f25128c};
            i8Var.f14468b = true;
            i8Var.f14469c = 27304;
            i8Var.f14470d = new z5.h(fVar, 26, a10);
            c10 = fVar.c(0, i8Var.a());
        }
        c10.d(new b(12));
    }
}

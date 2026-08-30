package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g9.v1;
import ra.a;
import ra.b;
import ra.e;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ads.ab0;
import com.google.android.gms.internal.ads.bj0;
import com.google.android.gms.internal.ads.dt0;
import com.google.android.gms.internal.ads.l21;
import com.google.android.gms.internal.ads.mb0;
import com.google.android.gms.internal.ads.na0;
import com.google.android.gms.internal.ads.t21;
import com.google.android.gms.internal.ads.w91;
import com.google.android.gms.internal.ads.yx;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ra implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14897u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f14898v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f14899w;

    public ra(dt0 dt0Var, v1 v1Var) {
        this.f14897u = 26;
        this.f14898v = v1Var;
        Objects.requireNonNull(dt0Var);
        this.f14899w = dt0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.ads.n81, com.google.android.gms.internal.ads.e81] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a() {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01f1 A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:14:0x009e, B:16:0x00ba, B:20:0x00c0, B:22:0x0183, B:25:0x0188, B:26:0x018f, B:28:0x01f1, B:29:0x01fd, B:31:0x020d, B:33:0x0215, B:35:0x0221, B:36:0x022b, B:37:0x024f), top: B:13:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x020d A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:14:0x009e, B:16:0x00ba, B:20:0x00c0, B:22:0x0183, B:25:0x0188, B:26:0x018f, B:28:0x01f1, B:29:0x01fd, B:31:0x020d, B:33:0x0215, B:35:0x0221, B:36:0x022b, B:37:0x024f), top: B:13:0x009e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b() {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.b():void");
    }

    private final /* synthetic */ void c() {
        bj0 bj0Var = (bj0) this.f14898v;
        Runnable runnable = (Runnable) this.f14899w;
        if (((l21) bj0Var.D) == null && !bj0Var.f4804u) {
            ((w91) bj0Var.f4807x).b("Initiate binding to the service.", new Object[0]);
            ArrayList arrayList = (ArrayList) bj0Var.f4809z;
            synchronized (arrayList) {
                arrayList.add(runnable);
            }
            t21 t21Var = new t21(bj0Var);
            bj0Var.C = t21Var;
            bj0Var.f4804u = true;
            if (!((Context) bj0Var.f4805v).bindService((Intent) bj0Var.A, t21Var, 65)) {
                ((w91) bj0Var.f4807x).b("Failed to bind to the service.", new Object[0]);
                bj0Var.f4804u = false;
                ArrayList arrayList2 = (ArrayList) bj0Var.f4809z;
                synchronized (arrayList2) {
                    arrayList2.clear();
                }
                return;
            }
            return;
        }
        if (bj0Var.f4804u) {
            ((w91) bj0Var.f4807x).b("Waiting to bind to the service.", new Object[0]);
            ArrayList arrayList3 = (ArrayList) bj0Var.f4809z;
            synchronized (arrayList3) {
                arrayList3.add(runnable);
            }
            return;
        }
        runnable.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0277 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.on, android.widget.RelativeLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v43, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.mb0] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.mb0] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.ra.run():void");
    }

    public String toString() {
        switch (this.f14897u) {
            case 0:
                e eVar = new e(ra.class.getSimpleName(), 15);
                qa qaVar = (qa) this.f14899w;
                e eVar2 = new e(14, false);
                ((e) eVar.f24677x).f24677x = eVar2;
                eVar.f24677x = eVar2;
                eVar2.f24676w = qaVar;
                return eVar.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ra(na0 na0Var, mb0 mb0Var) {
        this.f14897u = 16;
        this.f14898v = na0Var;
        this.f14899w = (com.google.android.gms.internal.ads.ph) mb0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ra(ab0 ab0Var, mb0 mb0Var) {
        this.f14897u = 17;
        this.f14898v = ab0Var;
        this.f14899w = (com.google.android.gms.internal.ads.ph) mb0Var;
    }

    public /* synthetic */ ra(Object obj, int i, Object obj2) {
        this.f14897u = i;
        this.f14898v = obj;
        this.f14899w = obj2;
    }

    public ra(com.google.android.gms.internal.ads.fp fpVar, Context context, yx yxVar) {
        this.f14897u = 9;
        this.f14898v = context;
        this.f14899w = yxVar;
    }

    public /* synthetic */ ra(int i, Object obj, Object obj2, boolean z3) {
        this.f14897u = i;
        this.f14899w = obj;
        this.f14898v = obj2;
    }
}

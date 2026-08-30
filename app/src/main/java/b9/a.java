package b9;

import android.os.Bundle;
import b0.e1;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import eb.i3;
import eb.u;
import ya.bb;
import ya.pf;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3108u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3109v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3110w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3111x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f3112y;

    public /* synthetic */ a(pf pfVar, e1 e1Var, bb bbVar, String str) {
        this.f3108u = 16;
        this.f3110w = pfVar;
        this.f3111x = e1Var;
        this.f3112y = bbVar;
        this.f3109v = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r4.isEmpty() == false) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, com.google.android.gms.internal.ads.hb] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x038a -> B:140:0x0391). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.a.run():void");
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z3) {
        this.f3108u = i;
        this.f3110w = obj2;
        this.f3109v = obj3;
        this.f3111x = obj4;
        this.f3112y = obj;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f3108u = i;
        this.f3110w = obj;
        this.f3109v = obj2;
        this.f3111x = obj3;
        this.f3112y = obj4;
    }

    public a(AppMeasurementDynamiteService appMeasurementDynamiteService, t0 t0Var, u uVar, String str) {
        this.f3108u = 1;
        this.f3110w = t0Var;
        this.f3111x = uVar;
        this.f3109v = str;
        this.f3112y = appMeasurementDynamiteService;
    }

    public a(i3 i3Var, String str, String str2, Bundle bundle) {
        this.f3108u = 6;
        this.f3109v = str;
        this.f3110w = str2;
        this.f3111x = bundle;
        this.f3112y = i3Var;
    }
}

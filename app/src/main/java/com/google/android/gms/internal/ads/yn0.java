package com.google.android.gms.internal.ads;
import ac.b;
import ca.f;
import d9.a;
import f9.k;
import g9.p;
import g9.r;
import l9.d;
import r0.e;
import r2.a;
import r2.d;
import r3.a;
import r5.a;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class yn0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12919a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f12920b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f12921c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12922d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final fp f12923f;

    public yn0(fp fpVar, Context context, ScheduledExecutorService scheduledExecutorService, wx wxVar, int i, boolean z3, boolean z9) {
        this.f12923f = fpVar;
        this.f12919a = context;
        this.f12920b = scheduledExecutorService;
        this.f12921c = wxVar;
        this.f12922d = z3;
        this.e = z9;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final b zza() {
        yx yxVar = new yx();
        d dVar = p.f17688g.f17689a;
        f fVar = f.f4036b;
        Context context = this.f12919a;
        int c10 = fVar.c(context, 12451000);
        if (c10 == 0 || c10 == 2) {
            xx.f12651a.execute(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(this.f12923f, context, yxVar));
        }
        q81 t3 = q81.t(yxVar);
        final int i = 1;
        f31 f31Var = new f31(this) { // from class: com.google.android.gms.internal.ads.xn0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ yn0 f12597b;

            {
                this.f12597b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
            
                if (((java.lang.Boolean) r.e.f17698c.a(com.google.android.gms.internal.ads.sl.f10647a4)).booleanValue() == false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
            
                if (((java.lang.Boolean) r.e.f17698c.a(com.google.android.gms.internal.ads.sl.Z3)).booleanValue() == false) goto L24;
             */
            @Override // com.google.android.gms.internal.ads.f31
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r9) {
                /*
                    r8 = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L89;
                        default: goto L5;
                    }
                L5:
                    com.google.android.gms.internal.ads.yn0 r0 = r8.f12597b
                    a r9 = (a) r9
                    com.google.android.gms.internal.ads.f3 r1 = new com.google.android.gms.internal.ads.f3
                    r2 = 5
                    r3 = 0
                    r1.<init>(r2, r3)
                    boolean r2 = r0.f12922d
                    if (r2 != 0) goto L27
                    com.google.android.gms.internal.ads.nl r2 = com.google.android.gms.internal.ads.sl.Z3
                    r r3 = r.e
                    com.google.android.gms.internal.ads.ql r3 = r3.f17698c
                    java.lang.Object r2 = a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L3a
                    goto L81
                L27:
                    com.google.android.gms.internal.ads.nl r2 = com.google.android.gms.internal.ads.sl.f10647a4
                    r r3 = r.e
                    com.google.android.gms.internal.ads.ql r3 = r3.f17698c
                    java.lang.Object r2 = a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L3a
                    goto L81
                L3a:
                    android.content.Context r1 = r0.f12919a     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    com.google.android.gms.internal.ads.jx0 r2 = com.google.android.gms.internal.ads.jx0.f(r1)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.util.Objects.requireNonNull(r9)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.String r3 = r9.f15805a     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.util.Objects.requireNonNull(r3)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.String r4 = r1.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.f10726f4     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    r r5 = r.e     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    com.google.android.gms.internal.ads.ql r5 = r5.f17698c     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.Object r1 = a(r1)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    long r5 = r1.longValue()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    boolean r7 = e     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.Class<com.google.android.gms.internal.ads.jx0> r1 = com.google.android.gms.internal.ads.jx0.class
                    monitor-enter(r1)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    com.google.android.gms.internal.ads.f3 r0 = a(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L6b
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
                    r1 = r0
                    goto L81
                L6b:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
                    throw r0     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                L6e:
                    r0 = move-exception
                    goto L71
                L70:
                    r0 = move-exception
                L71:
                    java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
                    k r2 = k.C
                    com.google.android.gms.internal.ads.px r2 = r2.f16817h
                    d(r1, r0)
                    com.google.android.gms.internal.ads.f3 r1 = new com.google.android.gms.internal.ads.f3
                    r0 = 5
                    r2 = 0
                    r1.<init>(r0, r2)
                L81:
                    com.google.android.gms.internal.ads.ml0 r0 = new com.google.android.gms.internal.ads.ml0
                    r2 = 0
                    r3 = 2
                    r0.<init>(r3, r9, r2, r1)
                    return r0
                L89:
                    com.google.android.gms.internal.ads.yn0 r0 = r8.f12597b
                    java.lang.Throwable r9 = (java.lang.Throwable) r9
                    p r9 = p.f17688g
                    d r9 = r9.f17689a
                    android.content.Context r9 = r0.f12919a
                    android.content.ContentResolver r9 = r9.getContentResolver()
                    r0 = 0
                    if (r9 != 0) goto L9c
                    r9 = r0
                    goto La2
                L9c:
                    java.lang.String r1 = "android_id"
                    java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r1)
                La2:
                    com.google.android.gms.internal.ads.ml0 r1 = new com.google.android.gms.internal.ads.ml0
                    com.google.android.gms.internal.ads.f3 r2 = new com.google.android.gms.internal.ads.f3
                    r3 = 5
                    r4 = 0
                    r2.<init>(r3, r4)
                    r3 = 2
                    r1.<init>(r3, r0, r9, r2)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xn0.apply(java.lang.Object):java.lang.Object");
            }
        };
        Executor executor = this.f12921c;
        final int i10 = 0;
        return ed1.S((q81) ed1.Y(ed1.d0(t3, f31Var, executor), ((Long) r.e.f17698c.a(sl.D1)).longValue(), TimeUnit.MILLISECONDS, this.f12920b), Throwable.class, new f31(this) { // from class: com.google.android.gms.internal.ads.xn0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ yn0 f12597b;

            {
                this.f12597b = this;
            }

            @Override // com.google.android.gms.internal.ads.f31
            public final Object apply(Object obj) {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    this = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L89;
                        default: goto L5;
                    }
                L5:
                    com.google.android.gms.internal.ads.yn0 r0 = r8.f12597b
                    a r9 = (a) r9
                    com.google.android.gms.internal.ads.f3 r1 = new com.google.android.gms.internal.ads.f3
                    r2 = 5
                    r3 = 0
                    r1.<init>(r2, r3)
                    boolean r2 = r0.f12922d
                    if (r2 != 0) goto L27
                    com.google.android.gms.internal.ads.nl r2 = com.google.android.gms.internal.ads.sl.Z3
                    r r3 = r.e
                    com.google.android.gms.internal.ads.ql r3 = r3.f17698c
                    java.lang.Object r2 = a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L3a
                    goto L81
                L27:
                    com.google.android.gms.internal.ads.nl r2 = com.google.android.gms.internal.ads.sl.f10647a4
                    r r3 = r.e
                    com.google.android.gms.internal.ads.ql r3 = r3.f17698c
                    java.lang.Object r2 = a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L3a
                    goto L81
                L3a:
                    android.content.Context r1 = r0.f12919a     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    com.google.android.gms.internal.ads.jx0 r2 = com.google.android.gms.internal.ads.jx0.f(r1)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.util.Objects.requireNonNull(r9)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.String r3 = r9.f15805a     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.util.Objects.requireNonNull(r3)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.String r4 = r1.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    com.google.android.gms.internal.ads.nl r1 = com.google.android.gms.internal.ads.sl.f10726f4     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    r r5 = r.e     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    com.google.android.gms.internal.ads.ql r5 = r5.f17698c     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.Object r1 = a(r1)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    long r5 = r1.longValue()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    boolean r7 = e     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.Class<com.google.android.gms.internal.ads.jx0> r1 = com.google.android.gms.internal.ads.jx0.class
                    monitor-enter(r1)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    com.google.android.gms.internal.ads.f3 r0 = a(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L6b
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
                    r1 = r0
                    goto L81
                L6b:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
                    throw r0     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                L6e:
                    r0 = move-exception
                    goto L71
                L70:
                    r0 = move-exception
                L71:
                    java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
                    k r2 = k.C
                    com.google.android.gms.internal.ads.px r2 = r2.f16817h
                    d(r1, r0)
                    com.google.android.gms.internal.ads.f3 r1 = new com.google.android.gms.internal.ads.f3
                    r0 = 5
                    r2 = 0
                    r1.<init>(r0, r2)
                L81:
                    com.google.android.gms.internal.ads.ml0 r0 = new com.google.android.gms.internal.ads.ml0
                    r2 = 0
                    r3 = 2
                    r0.<init>(r3, r9, r2, r1)
                    return r0
                L89:
                    com.google.android.gms.internal.ads.yn0 r0 = r8.f12597b
                    java.lang.Throwable r9 = (java.lang.Throwable) r9
                    p r9 = p.f17688g
                    d r9 = r9.f17689a
                    android.content.Context r9 = r0.f12919a
                    android.content.ContentResolver r9 = r9.getContentResolver()
                    r0 = 0
                    if (r9 != 0) goto L9c
                    r9 = r0
                    goto La2
                L9c:
                    java.lang.String r1 = "android_id"
                    java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r1)
                La2:
                    com.google.android.gms.internal.ads.ml0 r1 = new com.google.android.gms.internal.ads.ml0
                    com.google.android.gms.internal.ads.f3 r2 = new com.google.android.gms.internal.ads.f3
                    r3 = 5
                    r4 = 0
                    r2.<init>(r3, r4)
                    r3 = 2
                    r1.<init>(r3, r0, r9, r2)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xn0.apply(java.lang.Object):java.lang.Object");
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int zzb() {
        return 40;
    }
}

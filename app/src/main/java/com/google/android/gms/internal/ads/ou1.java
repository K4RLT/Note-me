package com.google.android.gms.internal.ads;

import android.media.metrics.PlaybackErrorEvent;
import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class ou1 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9237u;

    /* renamed from: v, reason: collision with root package name */
    public Object f9238v;

    /* renamed from: w, reason: collision with root package name */
    public Object f9239w;

    public /* synthetic */ ou1(su1 su1Var, PlaybackErrorEvent playbackErrorEvent) {
        this.f9237u = 1;
        this.f9238v = su1Var;
        this.f9239w = playbackErrorEvent;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:174|(2:176|(19:178|179|(1:181)|182|183|184|185|(1:189)|190|(1:192)|194|(1:196)(1:209)|(3:198|(1:205)(1:202)|(1:204))|(1:207)|208|162|(3:164|(1:166)(1:169)|(1:168))|170|171))|212|(5:214|(1:216)(1:222)|217|(1:219)|220)(1:223)|221|179|(0)|182|183|184|185|(2:187|189)|190|(0)|194|(0)(0)|(0)|(0)|208|162|(0)|170|171) */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x091b, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.H) == false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x08e3, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0501, code lost:
    
        if (r2.q() != false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0574, code lost:
    
        if (r2.q() != false) goto L213;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0927  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0682 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x02fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0267 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x025b A[Catch: IllegalStateException -> 0x029b, TryCatch #7 {IllegalStateException -> 0x029b, blocks: (B:34:0x024c, B:37:0x025f, B:40:0x026b, B:43:0x0273, B:45:0x027b, B:48:0x028c, B:51:0x0298, B:53:0x0294, B:56:0x0288, B:58:0x029f, B:60:0x02b1, B:61:0x02b6, B:63:0x02b4, B:331:0x0267, B:334:0x025b), top: B:33:0x024c }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0164 A[Catch: NameNotFoundException -> 0x0183, TryCatch #4 {NameNotFoundException -> 0x0183, blocks: (B:357:0x0159, B:359:0x0164, B:361:0x0170), top: B:356:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x027b A[Catch: IllegalStateException -> 0x029b, TryCatch #7 {IllegalStateException -> 0x029b, blocks: (B:34:0x024c, B:37:0x025f, B:40:0x026b, B:43:0x0273, B:45:0x027b, B:48:0x028c, B:51:0x0298, B:53:0x0294, B:56:0x0288, B:58:0x029f, B:60:0x02b1, B:61:0x02b6, B:63:0x02b4, B:331:0x0267, B:334:0x025b), top: B:33:0x024c }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x029f A[Catch: IllegalStateException -> 0x029b, TryCatch #7 {IllegalStateException -> 0x029b, blocks: (B:34:0x024c, B:37:0x025f, B:40:0x026b, B:43:0x0273, B:45:0x027b, B:48:0x028c, B:51:0x0298, B:53:0x0294, B:56:0x0288, B:58:0x029f, B:60:0x02b1, B:61:0x02b6, B:63:0x02b4, B:331:0x0267, B:334:0x025b), top: B:33:0x024c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0481  */
    /* JADX WARN: Type inference failed for: r0v127, types: [eb.x1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [eb.n, eb.k1] */
    /* JADX WARN: Type inference failed for: r10v0, types: [eb.z, eb.g0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a() {
        /*
            Method dump skipped, instructions count: 2528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ou1.a():void");
    }

    private final void b() {
        j6.p pVar;
        b6.h hVar = ((i6.a) this.f9239w).f18318u.f1776f;
        String str = (String) this.f9238v;
        synchronized (hVar.f1746k) {
            try {
                b6.v c10 = hVar.c(str);
                if (c10 != null) {
                    pVar = c10.f1790x;
                } else {
                    pVar = null;
                }
            } finally {
            }
        }
        if (pVar != null && pVar.b()) {
            synchronized (((i6.a) this.f9239w).f18320w) {
                ((i6.a) this.f9239w).f18323z.put(wa.y8.a(pVar), pVar);
                i6.a aVar = (i6.a) this.f9239w;
                ((i6.a) this.f9239w).A.put(wa.y8.a(pVar), f6.j.a(aVar.B, pVar, ((m6.b) aVar.f18319v).f20614b, aVar));
            }
        }
    }

    private final void c() {
        try {
            e();
        } catch (Error e) {
            synchronized (((jc.k) this.f9239w).f19153v) {
                ((jc.k) this.f9239w).f19154w = 1;
                throw e;
            }
        }
    }

    private final void d() {
        lb.s sVar = (lb.s) this.f9238v;
        com.google.android.play.core.assetpacks.bn bnVar = (com.google.android.play.core.assetpacks.bn) this.f9239w;
        synchronized (sVar) {
            Iterator it = new HashSet(sVar.f20261d).iterator();
            while (it.hasNext()) {
                ((g7.a) it.next()).getClass();
                String str = bnVar.f15575a;
                sf.n0 n0Var = g7.i.f17566a;
                str.getClass();
                g7.i.a(str, bnVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f9238v).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.f9238v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        jc.k.f19151z.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f9238v), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f9239w     // Catch: java.lang.Throwable -> L58
            jc.k r2 = (jc.k) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f19153v     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f9239w     // Catch: java.lang.Throwable -> L20
            jc.k r0 = (jc.k) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f19154w     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.f19155x     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f19155x = r6     // Catch: java.lang.Throwable -> L20
            r0.f19154w = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f9239w     // Catch: java.lang.Throwable -> L20
            jc.k r4 = (jc.k) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f19153v     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f9238v = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f9239w     // Catch: java.lang.Throwable -> L20
            jc.k r0 = (jc.k) r0     // Catch: java.lang.Throwable -> L20
            r0.f19154w = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f9238v     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f9238v = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = jc.k.f19151z     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f9238v     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.f9238v = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ou1.e():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:262:0x0558, code lost:
    
        r2 = r2 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0559, code lost:
    
        ((java.lang.Runnable) r18.f9238v).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x056a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x056c, code lost:
    
        com.google.android.gms.internal.mlkit_vision_digital_ink.eb.f14249z.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", "Exception while executing runnable " + java.lang.String.valueOf((java.lang.Runnable) r18.f9238v), (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0594, code lost:
    
        r18.f9238v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0568, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0597, code lost:
    
        r18.f9238v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0599, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x054f, code lost:
    
        if (r2 == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0294 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v15, types: [da.c] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v6, types: [fa.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ou1.run():void");
    }

    public String toString() {
        String str;
        String str2;
        switch (this.f9237u) {
            case 5:
                Runnable runnable = (Runnable) this.f9238v;
                if (runnable != null) {
                    return p.a.k("SequentialExecutorWorker{running=", runnable.toString(), "}");
                }
                int i = ((com.google.android.gms.internal.mlkit_vision_digital_ink.eb) this.f9239w).f14254y;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                str = "null";
                            } else {
                                str = "RUNNING";
                            }
                        } else {
                            str = "QUEUED";
                        }
                    } else {
                        str = "QUEUING";
                    }
                } else {
                    str = "IDLE";
                }
                return p.a.k("SequentialExecutorWorker{state=", str, "}");
            case 20:
                Runnable runnable2 = (Runnable) this.f9238v;
                if (runnable2 != null) {
                    return "SequentialExecutorWorker{running=" + runnable2 + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((jc.k) this.f9239w).f19154w;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                str2 = "null";
                            } else {
                                str2 = "RUNNING";
                            }
                        } else {
                            str2 = "QUEUED";
                        }
                    } else {
                        str2 = "QUEUING";
                    }
                } else {
                    str2 = "IDLE";
                }
                sb2.append(str2);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ou1(int i, Object obj, Object obj2, boolean z3) {
        this.f9237u = i;
        this.f9239w = obj;
        this.f9238v = obj2;
    }

    public /* synthetic */ ou1(int i) {
        this.f9237u = i;
    }

    public /* synthetic */ ou1(com.google.android.gms.internal.mlkit_vision_digital_ink.lw lwVar, String str, Uri uri) {
        this.f9237u = 6;
        this.f9238v = lwVar;
        this.f9239w = uri;
    }

    public /* synthetic */ ou1(Object obj, int i, Object obj2) {
        this.f9237u = i;
        this.f9238v = obj;
        this.f9239w = obj2;
    }

    public /* synthetic */ ou1(Executor executor, int i) {
        this.f9237u = i;
        this.f9239w = executor;
    }
}

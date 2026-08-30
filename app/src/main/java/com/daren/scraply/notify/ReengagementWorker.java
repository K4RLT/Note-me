package com.daren.scraply.notify;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public final class ReengagementWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReengagementWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:3|(14:5|6|7|(1:(1:10)(2:29|30))(4:31|32|33|(1:35))|11|12|(1:14)|15|16|17|(1:19)(1:25)|20|21|22))|38|6|7|(0)(0)|11|12|(0)|15|16|17|(0)(0)|20|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
    
        android.util.Log.e("ReengageScheduler", "No se pudo encadenar la próxima vuelta", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0029, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0047, code lost:
    
        android.util.Log.e("ReengageWorker", "Fallo evaluando el reenganche", r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(te.c r11) {
        /*
            r10 = this;
            java.lang.String r0 = "scraply_reengagement"
            boolean r1 = r11 instanceof q7.j
            if (r1 == 0) goto L15
            r1 = r11
            q7.j r1 = (q7.j) r1
            int r2 = r1.f23579w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f23579w = r2
            goto L1c
        L15:
            q7.j r1 = new q7.j
            ve.c r11 = (ve.c) r11
            r1.<init>(r10, r11)
        L1c:
            java.lang.Object r11 = r1.f23577u
            int r2 = r1.f23579w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            pe.a.e(r11)     // Catch: java.lang.Exception -> L29
            goto L4e
        L29:
            r11 = move-exception
            goto L47
        L2b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r11)
            r11 = 0
            return r11
        L32:
            pe.a.e(r11)
            android.content.Context r11 = r10.getApplicationContext()     // Catch: java.lang.Exception -> L29
            r11.getClass()     // Catch: java.lang.Exception -> L29
            r1.f23579w = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r11 = r10.c(r11, r1)     // Catch: java.lang.Exception -> L29
            ue.a r1 = ue.a.f27192u
            if (r11 != r1) goto L4e
            return r1
        L47:
            java.lang.String r1 = "ReengageWorker"
            java.lang.String r2 = "Fallo evaluando el reenganche"
            android.util.Log.e(r1, r2, r11)
        L4e:
            android.content.Context r11 = r10.getApplicationContext()
            r11.getClass()
            q7.g r1 = q7.e.c(r11)
            long r4 = java.lang.System.currentTimeMillis()
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r2.setTimeInMillis(r4)
            long r6 = ya.ia.a(r2)
            r8 = 60000(0xea60, double:2.9644E-319)
            long r4 = r4 + r8
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto L81
            java.lang.Object r2 = r2.clone()
            r2.getClass()
            java.util.Calendar r2 = (java.util.Calendar) r2
            r4 = 6
            r2.add(r4, r3)
            long r6 = ya.ia.a(r2)
        L81:
            long r1 = q7.e.d(r1, r6)
            long r4 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r4
            b6.r r11 = b6.r.b(r11)     // Catch: java.lang.Exception -> Lba
            ra.e r4 = new ra.e     // Catch: java.lang.Exception -> Lba
            java.lang.Class<com.daren.scraply.notify.ReengagementWorker> r5 = com.daren.scraply.notify.ReengagementWorker.class
            r4.<init>(r5)     // Catch: java.lang.Exception -> Lba
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 >= 0) goto L9a
            goto L9b
        L9a:
            r8 = r1
        L9b:
            r4.z(r8)     // Catch: java.lang.Exception -> Lba
            java.lang.Object r1 = r4.f24677x     // Catch: java.lang.Exception -> Lba
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1     // Catch: java.lang.Exception -> Lba
            r1.add(r0)     // Catch: java.lang.Exception -> Lba
            a6.s r1 = r4.m()     // Catch: java.lang.Exception -> Lba
            java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch: java.lang.Exception -> Lba
            b6.o r2 = new b6.o     // Catch: java.lang.Exception -> Lba
            r2.<init>(r11, r0, r3, r1)     // Catch: java.lang.Exception -> Lba
            a6.w r11 = r2.a()     // Catch: java.lang.Exception -> Lba
            r11.getClass()     // Catch: java.lang.Exception -> Lba
            goto Lc2
        Lba:
            r11 = move-exception
            java.lang.String r0 = "ReengageScheduler"
            java.lang.String r1 = "No se pudo encadenar la próxima vuelta"
            android.util.Log.e(r0, r1, r11)
        Lc2:
            a6.n r11 = a6.o.a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daren.scraply.notify.ReengagementWorker.a(te.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0243, code lost:
    
        if (r10 >= r1.f23571b) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Context r29, ve.c r30) {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daren.scraply.notify.ReengagementWorker.c(android.content.Context, ve.c):java.lang.Object");
    }
}

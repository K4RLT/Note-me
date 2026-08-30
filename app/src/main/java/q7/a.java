package q7;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import lb.q;

/* loaded from: classes.dex */
public final class a {
    public static final void a(Context context, NotificationManager notificationManager, d dVar, int i, int i10, int i11) {
        boolean z3;
        q.k();
        NotificationChannel f10 = q.f(dVar.getChannelId(), i11, context.getString(i));
        f10.setDescription(context.getString(i10));
        boolean z9 = false;
        if (dVar != d.TIP) {
            z3 = true;
        } else {
            z3 = false;
        }
        f10.setShowBadge(z3);
        if (i11 >= 3) {
            z9 = true;
        }
        f10.enableVibration(z9);
        notificationManager.createNotificationChannel(f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        r7 = r7.getNotificationChannel(r12.getChannelId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r7 != 0) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f0  */
    /* JADX WARN: Type inference failed for: r1v2, types: [f3.j, f3.f] */
    /* JADX WARN: Type inference failed for: r4v6, types: [f3.j, f3.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.content.Context r11, q7.d r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.a.b(android.content.Context, q7.d, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean):boolean");
    }

    public static /* synthetic */ boolean c(Context context, d dVar, String str, String str2, String str3, String str4, int i, int i10) {
        if ((i10 & 32) != 0) {
            str4 = null;
        }
        String str5 = str4;
        if ((i10 & 64) != 0) {
            i = dVar.getNotificationId();
        }
        return b(context, dVar, str, str2, str3, str5, i, false);
    }
}

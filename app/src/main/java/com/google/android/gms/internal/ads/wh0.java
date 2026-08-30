package com.google.android.gms.internal.ads;
import eb.y;
import f3.f;
import f3.i;
import f3.j;
import f3.q;
import f9.k;
import g9.r;
import i9.a;
import j6.s;
import j9.d;
import k9.a0;
import k9.f0;
import k9.t;
import l9.i;
import l9.l;
import oa.a;
import oa.b;
import r0.c;
import r0.e;
import r0.j;
import r2.a;
import r3.a;
import r3.i;
import r4.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.daren.scraply.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class wh0 extends ph implements tt {
    public static final /* synthetic */ int B = 0;
    public String A;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f12241u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f12242v;

    /* renamed from: w, reason: collision with root package name */
    public final be0 f12243w;

    /* renamed from: x, reason: collision with root package name */
    public final l f12244x;

    /* renamed from: y, reason: collision with root package name */
    public final rh0 f12245y;

    /* renamed from: z, reason: collision with root package name */
    public String f12246z;

    public wh0(Context context, rh0 rh0Var, l lVar, be0 be0Var) {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        this.f12241u = new HashMap();
        this.f12242v = context;
        this.f12243w = be0Var;
        this.f12244x = lVar;
        this.f12245y = rh0Var;
    }

    public static String C4(int i, String str) {
        Resources c10 = k.C.f16817h.c();
        if (c10 == null) {
            return str;
        }
        try {
            return c10.getString(i);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    public static void w4(Context context, be0 be0Var, rh0 rh0Var, String str, String str2, Map map) {
        String str3;
        String str4;
        k kVar = k.C;
        if (true != kVar.f16817h.i(context)) {
            str3 = "offline";
        } else {
            str3 = "online";
        }
        if (be0Var != null) {
            s a10 = be0Var.a();
            a10.k("gqi", str);
            a10.k("action", str2);
            a10.k("device_connectivity", str3);
            kVar.f16819k.getClass();
            a10.k("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                a10.k((String) entry.getKey(), (String) entry.getValue());
            }
            fe0 fe0Var = ((be0) a10.f18982w).f4770a;
            str4 = fe0Var.f6049f.i((ConcurrentHashMap) a10.f18981v);
        } else {
            str4 = "";
        }
        String str5 = str4;
        k.C.f16819k.getClass();
        rb rbVar = new rb(2, System.currentTimeMillis(), str, str5);
        rh0Var.getClass();
        rh0Var.f(new com.google.android.gms.internal.mlkit_vision_digital_ink.gw(rh0Var, 7, rbVar));
    }

    public static final PendingIntent x4(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT >= 29 && str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
            return PendingIntent.getActivity(context, 0, i21.a(intent, 201326592), 201326592);
        }
        intent.setClassName(context, "com.google.android.gms.ads.AdService");
        return PendingIntent.getService(context, 0, i21.a(intent, 1140850688), 1140850688);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A4(android.app.Activity r7, d r8) {
        /*
            r6 = this;
            k r0 = k.C
            f0 r1 = r0.f16813c
            android.app.AlertDialog$Builder r1 = f0.k(r7)
            com.google.android.gms.internal.ads.c00 r2 = new com.google.android.gms.internal.ads.c00
            r3 = 2
            r2.<init>(r3, r8)
            android.app.AlertDialog$Builder r1 = r1.setOnCancelListener(r2)
            com.google.android.gms.internal.ads.px r0 = r0.f16817h
            android.content.res.Resources r0 = c()
            r2 = 0
            if (r0 != 0) goto L1d
        L1b:
            r0 = r2
            goto L24
        L1d:
            r3 = 2131558442(0x7f0d002a, float:1.87422E38)
            android.content.res.XmlResourceParser r0 = r0.getLayout(r3)     // Catch: android.content.res.Resources.NotFoundException -> L1b
        L24:
            java.lang.String r3 = "Thanks for your interest.\nWe will share more once you're back online."
            r4 = 2131821021(0x7f1101dd, float:1.9274773E38)
            if (r0 != 0) goto L37
            java.lang.String r7 = C4(r4, r3)
            r1.setMessage(r7)
            android.app.AlertDialog r7 = r1.create()
            goto La0
        L37:
            android.view.LayoutInflater r7 = r7.getLayoutInflater()     // Catch: android.content.res.Resources.NotFoundException -> L95
            android.view.View r7 = r7.inflate(r0, r2)     // Catch: android.content.res.Resources.NotFoundException -> L95
            r1.setView(r7)
            java.lang.String r0 = r6.f12246z
            java.util.HashMap r3 = r6.f12241u
            java.lang.Object r0 = r3.get(r0)
            com.google.android.gms.internal.ads.oh0 r0 = (com.google.android.gms.internal.ads.oh0) r0
            if (r0 != 0) goto L51
            java.lang.String r0 = ""
            goto L53
        L51:
            java.lang.String r0 = r0.f9122a
        L53:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            r5 = 0
            if (r4 != 0) goto L69
            r4 = 2131361929(0x7f0a0089, float:1.8343624E38)
            android.view.View r4 = r7.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setVisibility(r5)
            r4.setText(r0)
        L69:
            java.lang.String r0 = r6.f12246z
            java.lang.Object r0 = r3.get(r0)
            com.google.android.gms.internal.ads.oh0 r0 = (com.google.android.gms.internal.ads.oh0) r0
            if (r0 != 0) goto L74
            goto L76
        L74:
            android.graphics.drawable.Drawable r2 = r0.f9124c
        L76:
            if (r2 == 0) goto L84
            r0 = 2131361930(0x7f0a008a, float:1.8343626E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r7.setImageDrawable(r2)
        L84:
            android.app.AlertDialog r7 = r1.create()
            android.view.Window r0 = r7.getWindow()
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>(r5)
            r0.setBackgroundDrawable(r1)
            goto La0
        L95:
            java.lang.String r7 = C4(r4, r3)
            r1.setMessage(r7)
            android.app.AlertDialog r7 = r1.create()
        La0:
            r7.show()
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            com.google.android.gms.internal.ads.sh0 r1 = new com.google.android.gms.internal.ads.sh0
            r1.<init>(r6, r7, r0, r8)
            r7 = 3000(0xbb8, double:1.482E-320)
            r0.schedule(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wh0.A4(android.app.Activity, d):void");
    }

    public final void B4(String str, String str2, Map map) {
        w4(this.f12242v, this.f12243w, this.f12245y, str, str2, map);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(1:3)(1:32)|4|(1:6)(1:31)|7|(9:11|12|(2:24|25)|14|15|16|17|18|19)|30|(0)|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e8, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e9, code lost:
    
        r9.put("notification_not_shown_reason", r8.getMessage());
        r8 = "offline_notification_failed";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12, types: [j, f] */
    @Override // com.google.android.gms.internal.ads.tt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I1(a r8, a r9) {
        /*
            r7 = this;
            java.lang.Object r8 = b.z1(r8)
            android.content.Context r8 = (android.content.Context) r8
            java.lang.String r0 = r9.f18354u
            java.lang.String r1 = r9.f18355v
            java.lang.String r9 = r9.f18356w
            java.util.HashMap r2 = r7.f12241u
            java.lang.String r3 = r7.f12246z
            java.lang.Object r2 = r2.get(r3)
            com.google.android.gms.internal.ads.oh0 r2 = (com.google.android.gms.internal.ads.oh0) r2
            if (r2 != 0) goto L1b
            java.lang.String r2 = ""
            goto L1d
        L1b:
            java.lang.String r2 = r2.f9122a
        L1d:
            k r3 = k.C
            y r3 = r3.f16815f
            i(r8)
            java.lang.String r3 = "offline_notification_clicked"
            android.app.PendingIntent r3 = x4(r8, r3, r1, r0)
            java.lang.String r4 = "offline_notification_dismissed"
            android.app.PendingIntent r0 = x4(r8, r4, r1, r0)
            i r4 = new i
            java.lang.String r5 = "offline_notification_channel"
            r4.<init>(r8, r5)
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L55
            r5 = 2131821023(0x7f1101df, float:1.9274777E38)
            java.lang.String r6 = "You are back online! Continue learning about %s"
            java.lang.String r5 = C4(r5, r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = java.lang.String.format(r5, r2)
            java.lang.CharSequence r2 = i.b(r2)
            r4.e = r2
            goto L64
        L55:
            r2 = 2131821022(0x7f1101de, float:1.9274775E38)
            java.lang.String r5 = "You are back online! Let's pick up where we left off"
            java.lang.String r2 = C4(r2, r5)
            java.lang.CharSequence r2 = i.b(r2)
            r4.e = r2
        L64:
            r2 = 16
            r5 = 1
            r4.c(r2, r5)
            android.app.Notification r2 = r4.f16678t
            r2.deleteIntent = r0
            r4.f16666g = r3
            android.content.pm.ApplicationInfo r0 = r8.getApplicationInfo()
            int r0 = r0.icon
            r2.icon = r0
            com.google.android.gms.internal.ads.nl r0 = com.google.android.gms.internal.ads.sl.G9
            r r2 = r.e
            com.google.android.gms.internal.ads.ql r3 = r2.f17698c
            java.lang.Object r0 = a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r4.f16668j = r0
            com.google.android.gms.internal.ads.nl r0 = com.google.android.gms.internal.ads.sl.I9
            com.google.android.gms.internal.ads.ql r2 = r2.f17698c
            java.lang.Object r0 = a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto Lb3
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto Lb3
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> Lb3
            r0.<init>(r9)     // Catch: java.io.IOException -> Lb3
            java.net.URLConnection r9 = r0.openConnection()     // Catch: java.io.IOException -> Lb3
            java.io.InputStream r9 = r9.getInputStream()     // Catch: java.io.IOException -> Lb3
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r9)     // Catch: java.io.IOException -> Lb3
            goto Lb4
        Lb3:
            r9 = r2
        Lb4:
            if (r9 == 0) goto Lce
            r4.d(r9)     // Catch: android.content.res.Resources.NotFoundException -> Lce
            f r0 = new f     // Catch: android.content.res.Resources.NotFoundException -> Lce
            r0.<init>()     // Catch: android.content.res.Resources.NotFoundException -> Lce
            androidx.core.graphics.drawable.IconCompat r3 = new androidx.core.graphics.drawable.IconCompat     // Catch: android.content.res.Resources.NotFoundException -> Lce
            r3.<init>(r5)     // Catch: android.content.res.Resources.NotFoundException -> Lce
            r3.f664b = r9     // Catch: android.content.res.Resources.NotFoundException -> Lce
            r0.f16658d = r3     // Catch: android.content.res.Resources.NotFoundException -> Lce
            e = r2     // Catch: android.content.res.Resources.NotFoundException -> Lce
            r0.f16659f = r5     // Catch: android.content.res.Resources.NotFoundException -> Lce
            r4.e(r0)     // Catch: android.content.res.Resources.NotFoundException -> Lce
        Lce:
            java.lang.String r9 = "notification"
            java.lang.Object r8 = r8.getSystemService(r9)
            android.app.NotificationManager r8 = (android.app.NotificationManager) r8
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            android.app.Notification r0 = a()     // Catch: java.lang.IllegalArgumentException -> Le8
            r2 = 54321(0xd431, float:7.612E-41)
            r8.notify(r1, r2, r0)     // Catch: java.lang.IllegalArgumentException -> Le8
            java.lang.String r8 = "offline_notification_impression"
            goto Lf4
        Le8:
            r8 = move-exception
            java.lang.String r0 = "notification_not_shown_reason"
            java.lang.String r8 = r8.getMessage()
            r9.put(r0, r8)
            java.lang.String r8 = "offline_notification_failed"
        Lf4:
            r7.B4(r1, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wh0.I1(a, a):void");
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final void Q(a aVar) {
        ph0 ph0Var = (ph0) b.z1(aVar);
        Activity activity = ph0Var.f9521a;
        d dVar = ph0Var.f9522b;
        this.f12246z = ph0Var.f9523c;
        this.A = ph0Var.f9524d;
        if (!((Boolean) r.e.f17698c.a(sl.F9)).booleanValue()) {
            B4(this.f12246z, "dialog_impression", d61.A);
            f0 f0Var = k.C.f16813c;
            AlertDialog.Builder k3 = f0.k(activity);
            int i = 0;
            k3.setTitle(C4(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(C4(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(C4(R.string.offline_opt_in_confirm, "OK"), new vh0(this, activity, dVar, 1)).setNegativeButton(C4(R.string.offline_opt_in_decline, "No thanks"), new th0(this, dVar, i)).setOnCancelListener(new uh0(this, dVar, i));
            k3.create().show();
            return;
        }
        y4(activity, dVar);
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final void X3(String[] strArr, int[] iArr, a aVar) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                ph0 ph0Var = (ph0) b.z1(aVar);
                Activity activity = ph0Var.f9521a;
                d dVar = ph0Var.f9522b;
                HashMap hashMap = new HashMap();
                if (iArr[i] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    z4();
                    A4(activity, dVar);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (dVar != null) {
                        dVar.l();
                    }
                }
                B4(this.f12246z, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final void e() {
        this.f12245y.f(new hx0(23, this.f12244x));
    }

    @Override // com.google.android.gms.internal.ads.tt
    public final void s0(Intent intent) {
        rh0 rh0Var = this.f12245y;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                px pxVar = k.C.f16817h;
                Context context = this.f12242v;
                boolean i = pxVar.i(context);
                HashMap hashMap = new HashMap();
                char c10 = 2;
                if (stringExtra.equals("offline_notification_clicked")) {
                    hashMap.put("offline_notification_action", "offline_notification_clicked");
                    if (true == i) {
                        c10 = 1;
                    }
                    hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        hashMap.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        hashMap.put("olaa", "olaf");
                    }
                } else {
                    hashMap.put("offline_notification_action", "offline_notification_dismissed");
                }
                B4(stringExtra2, "offline_notification_action", hashMap);
                try {
                    SQLiteDatabase writableDatabase = rh0Var.getWritableDatabase();
                    if (c10 == 1) {
                        rh0Var.f10221v.execute(new r1(7, writableDatabase, stringExtra2, this.f12244x));
                    } else {
                        writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                    }
                } catch (SQLiteException e) {
                    String concat = "Failed to get writable offline buffering database: ".concat(e.toString());
                    int i10 = a0.f19634b;
                    i.c(concat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Intent intent = (Intent) qh.b(parcel, Intent.CREATOR);
                qh.f(parcel);
                s0(intent);
                break;
            case 2:
                a v12 = b.v1(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                qh.f(parcel);
                I1(v12, new a(readString, readString2, ""));
                break;
            case 3:
                e();
                break;
            case 4:
                a v13 = b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                Q(v13);
                break;
            case 5:
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                a v14 = b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                X3(createStringArray, createIntArray, v14);
                break;
            case 6:
                a v15 = b.v1(parcel.readStrongBinder());
                a aVar = (a) qh.b(parcel, a.CREATOR);
                qh.f(parcel);
                I1(v15, aVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public final void v4(String str, ra0 ra0Var) {
        zn znVar;
        String str2 = "";
        String f10 = ra0Var.f();
        String a10 = ra0Var.a();
        if (TextUtils.isEmpty(f10)) {
            if (a10 == null) {
                f10 = "";
            } else {
                f10 = a10;
            }
        }
        zn b10 = ra0Var.b();
        if (b10 != null) {
            try {
                str2 = b10.zzb().toString();
            } catch (RemoteException unused) {
            }
        }
        synchronized (ra0Var) {
            znVar = ra0Var.f10181s;
        }
        Drawable drawable = null;
        if (znVar != null) {
            try {
                a zza = znVar.zza();
                if (zza != null) {
                    drawable = (Drawable) b.z1(zza);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f12241u.put(str, new oh0(f10, str2, drawable));
    }

    public final void y4(Activity activity, d dVar) {
        f0 f0Var = k.C.f16813c;
        if (!new q(activity).f16702b.areNotificationsEnabled()) {
            int i = Build.VERSION.SDK_INT;
            d61 d61Var = d61.A;
            if (i < 33) {
                AlertDialog.Builder k3 = f0.k(activity);
                int i10 = 1;
                k3.setTitle(C4(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(C4(R.string.notifications_permission_confirm, "Allow"), new vh0(this, activity, dVar, 0)).setNegativeButton(C4(R.string.notifications_permission_decline, "Don't allow"), new th0(this, dVar, i10)).setOnCancelListener(new uh0(this, dVar, i10));
                k3.create().show();
                B4(this.f12246z, "rtsdi", d61Var);
                return;
            }
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            B4(this.f12246z, "asnpdi", d61Var);
            return;
        }
        z4();
        A4(activity, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z4() {
        /*
            r7 = this;
            k r0 = k.C     // Catch: android.os.RemoteException -> L22
            f0 r0 = r0.f16813c     // Catch: android.os.RemoteException -> L22
            android.content.Context r0 = r7.f12242v     // Catch: android.os.RemoteException -> L22
            t r1 = f0.b(r0)     // Catch: android.os.RemoteException -> L22
            b r2 = new b     // Catch: android.os.RemoteException -> L22
            r2.<init>(r0)     // Catch: android.os.RemoteException -> L22
            a r3 = new a     // Catch: android.os.RemoteException -> L22
            java.lang.String r4 = r7.A     // Catch: android.os.RemoteException -> L22
            java.lang.String r5 = r7.f12246z     // Catch: android.os.RemoteException -> L22
            java.util.HashMap r6 = r7.f12241u     // Catch: android.os.RemoteException -> L22
            java.lang.Object r6 = r6.get(r5)     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.internal.ads.oh0 r6 = (com.google.android.gms.internal.ads.oh0) r6     // Catch: android.os.RemoteException -> L22
            if (r6 != 0) goto L24
            java.lang.String r6 = ""
            goto L26
        L22:
            r0 = move-exception
            goto L41
        L24:
            java.lang.String r6 = r6.f9123b     // Catch: android.os.RemoteException -> L22
        L26:
            r3.<init>(r4, r5, r6)     // Catch: android.os.RemoteException -> L22
            boolean r2 = r1.zzg(r2, r3)     // Catch: android.os.RemoteException -> L22
            if (r2 != 0) goto L3f
            b r3 = new b     // Catch: android.os.RemoteException -> L3d
            r3.<init>(r0)     // Catch: android.os.RemoteException -> L3d
            java.lang.String r0 = r7.A     // Catch: android.os.RemoteException -> L3d
            java.lang.String r4 = r7.f12246z     // Catch: android.os.RemoteException -> L3d
            boolean r0 = r1.zze(r3, r0, r4)     // Catch: android.os.RemoteException -> L3d
            goto L4a
        L3d:
            r0 = move-exception
            goto L42
        L3f:
            r0 = 1
            goto L4a
        L41:
            r2 = 0
        L42:
            int r1 = a0.f19634b
            java.lang.String r1 = "Failed to schedule offline notification poster."
            i.d(r1, r0)
            r0 = r2
        L4a:
            if (r0 != 0) goto L5c
            com.google.android.gms.internal.ads.rh0 r0 = r7.f12245y
            java.lang.String r1 = r7.f12246z
            j(r1)
            java.lang.String r0 = r7.f12246z
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.d61 r2 = com.google.android.gms.internal.ads.d61.A
            r7.B4(r0, r1, r2)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wh0.z4():void");
    }
}

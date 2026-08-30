package lb;
import c.a;
import g.b;
import q.e;
import q.k;
import v.h;

import android.R;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r extends com.google.android.gms.internal.play_billing.d {
    public final NotificationManager A;

    /* renamed from: v, reason: collision with root package name */
    public final c7.a f20239v;

    /* renamed from: w, reason: collision with root package name */
    public final Context f20240w;

    /* renamed from: x, reason: collision with root package name */
    public final v f20241x;

    /* renamed from: y, reason: collision with root package name */
    public final r1 f20242y;

    /* renamed from: z, reason: collision with root package name */
    public final i0 f20243z;

    public r(Context context, v vVar, r1 r1Var, i0 i0Var) {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService", 2);
        this.f20239v = new c7.a("AssetPackExtractionService", 5);
        this.f20240w = context;
        this.f20241x = vVar;
        this.f20242y = r1Var;
        this.f20243z = i0Var;
        this.A = (NotificationManager) context.getSystemService("notification");
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final boolean M0(Parcel parcel, int i) {
        boolean z3;
        Notification.Builder priority;
        String[] packagesForUid;
        mb.k kVar = null;
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                if (queryLocalInterface instanceof mb.k) {
                    kVar = (mb.k) queryLocalInterface;
                } else {
                    kVar = new mb.k(readStrongBinder);
                }
            }
            mb.b(parcel);
            this.f20239v.a("clearAssetPackStorage AIDL call", new Object[0]);
            Context context = this.f20240w;
            if (mb.a(context) && (packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid())) != null && Arrays.asList(packagesForUid).contains("com.android.vending")) {
                h(this.f20241x.e());
                Bundle bundle = new Bundle();
                Parcel R = kVar.R();
                R.writeInt(1);
                bundle.writeToParcel(R, 0);
                kVar.r0(R, 4);
                return true;
            }
            kVar.u4(new Bundle());
            return true;
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) mb.a(parcel);
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
            if (queryLocalInterface2 instanceof mb.k) {
                kVar = (mb.k) queryLocalInterface2;
            } else {
                kVar = new mb.k(readStrongBinder2);
            }
        }
        mb.b(parcel);
        synchronized (this) {
            try {
                this.f20239v.a("updateServiceState AIDL call", new Object[0]);
            } finally {
            }
            if (mb.a(this.f20240w)) {
                String[] packagesForUid2 = this.f20240w.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                if (packagesForUid2 != null && Arrays.asList(packagesForUid2).contains("com.android.vending")) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    int i10 = bundle2.getInt("action_type");
                    i0 i0Var = this.f20243z;
                    synchronized (i0Var.f20160v) {
                        i0Var.f20160v.add(kVar);
                    }
                    if (i10 == 1) {
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 26) {
                            String string = bundle2.getString("notification_channel_name");
                            synchronized (this) {
                                if (string == null) {
                                    string = "File downloads by Play";
                                }
                                k();
                                this.A.createNotificationChannel(e(string));
                            }
                        }
                        this.f20242y.b(true);
                        i0 i0Var2 = this.f20243z;
                        String string2 = bundle2.getString("notification_title");
                        String string3 = bundle2.getString("notification_subtext");
                        long j10 = bundle2.getLong("notification_timeout", 600000L);
                        Parcelable parcelable = bundle2.getParcelable("notification_on_click_intent");
                        Context context2 = this.f20240w;
                        if (i11 >= 26) {
                            priority = b(context2).setTimeoutAfter(j10);
                        } else {
                            priority = new Notification.Builder(context2).setPriority(-2);
                        }
                        if (parcelable instanceof PendingIntent) {
                            priority.setContentIntent((PendingIntent) parcelable);
                        }
                        Notification.Builder ongoing = priority.setSmallIcon(R.drawable.stat_sys_download).setOngoing(false);
                        if (string2 == null) {
                            string2 = "Downloading additional file";
                        }
                        Notification.Builder contentTitle = ongoing.setContentTitle(string2);
                        if (string3 == null) {
                            string3 = "Transferring";
                        }
                        contentTitle.setSubText(string3);
                        int i12 = bundle2.getInt("notification_color");
                        if (i12 != 0) {
                            priority.setColor(i12).setVisibility(-1);
                        }
                        i0Var2.f20163y = priority.build();
                        this.f20240w.bindService(new Intent(this.f20240w, (Class<?>) ExtractionForegroundService.class), this.f20243z, 1);
                        return true;
                    }
                    if (i10 == 2) {
                        this.f20242y.b(false);
                        i0 i0Var3 = this.f20243z;
                        i0Var3.f20159u.a("Stopping foreground installation service.", new Object[0]);
                        i0Var3.f20161w.unbindService(i0Var3);
                        ExtractionForegroundService extractionForegroundService = i0Var3.f20162x;
                        if (extractionForegroundService != null) {
                            synchronized (extractionForegroundService) {
                                extractionForegroundService.stopForeground(true);
                                extractionForegroundService.stopSelf();
                            }
                        }
                        i0Var3.a();
                        return true;
                    }
                    this.f20239v.c("Unknown action type received: %d", Integer.valueOf(i10));
                    kVar.u4(new Bundle());
                    return true;
                }
            }
            kVar.u4(new Bundle());
            return true;
        }
    }
}

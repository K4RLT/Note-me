package lb;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i0 implements ServiceConnection {

    /* renamed from: u, reason: collision with root package name */
    public final c7.a f20159u = new c7.a("ExtractionForegroundServiceConnection", 5);

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f20160v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final Context f20161w;

    /* renamed from: x, reason: collision with root package name */
    public ExtractionForegroundService f20162x;

    /* renamed from: y, reason: collision with root package name */
    public Notification f20163y;

    public i0(Context context) {
        this.f20161w = context;
    }

    public final void a() {
        ArrayList arrayList;
        synchronized (this.f20160v) {
            arrayList = new ArrayList(this.f20160v);
            this.f20160v.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mb.k kVar = (mb.k) arrayList.get(i);
            try {
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                Parcel R = kVar.R();
                int i10 = mb.g.f20774a;
                R.writeInt(1);
                bundle.writeToParcel(R, 0);
                R.writeInt(1);
                bundle2.writeToParcel(R, 0);
                kVar.r0(R, 2);
            } catch (RemoteException unused) {
                this.f20159u.c("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f20159u.a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((h0) iBinder).f20152u;
        this.f20162x = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.f20163y);
        a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}

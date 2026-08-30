package f3;
import b.a;
import b.c;
import p.a;

import android.app.Notification;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f16684a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16685b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f16686c;

    public m(String str, int i, Notification notification) {
        this.f16684a = str;
        this.f16685b = i;
        this.f16686c = notification;
    }

    public final void a(c cVar) {
        String str = this.f16684a;
        int i = this.f16685b;
        a aVar = (a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(c.f1137c);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(null);
            Notification notification = this.f16686c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f1135u.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f16684a);
        sb2.append(", id:");
        return a.j(this.f16685b, ", tag:null]", sb2);
    }
}

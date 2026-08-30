package g5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class g extends Binder implements e {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f17443u;

    public g(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f17443u = multiInstanceInvalidationService;
        attachInterface(this, e.f17433q);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, g5.c] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, g5.c] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) {
        h hVar;
        String str = e.f17433q;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        d dVar = null;
        d dVar2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i10);
                }
                int readInt = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f17443u;
                synchronized (multiInstanceInvalidationService.f1094w) {
                    String str2 = (String) multiInstanceInvalidationService.f1093v.get(Integer.valueOf(readInt));
                    if (str2 == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                    } else {
                        int beginBroadcast = multiInstanceInvalidationService.f1094w.beginBroadcast();
                        int i11 = 0;
                        while (true) {
                            hVar = multiInstanceInvalidationService.f1094w;
                            if (i11 >= beginBroadcast) {
                                break;
                            }
                            try {
                                Object broadcastCookie = hVar.getBroadcastCookie(i11);
                                broadcastCookie.getClass();
                                Integer num = (Integer) broadcastCookie;
                                int intValue = num.intValue();
                                String str3 = (String) multiInstanceInvalidationService.f1093v.get(num);
                                if (readInt != intValue && str2.equals(str3)) {
                                    try {
                                        ((d) multiInstanceInvalidationService.f1094w.getBroadcastItem(i11)).j1(createStringArray);
                                    } catch (RemoteException e) {
                                        Log.w("ROOM", "Error invoking a remote callback", e);
                                    }
                                }
                                i11++;
                            } catch (Throwable th) {
                                multiInstanceInvalidationService.f1094w.finishBroadcast();
                                throw th;
                            }
                        }
                        hVar.finishBroadcast();
                    }
                }
                return true;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(d.f17427p);
                if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
                    dVar2 = (d) queryLocalInterface;
                } else {
                    Object obj = new Object();
                    obj.f17424u = readStrongBinder;
                    dVar2 = obj;
                }
            }
            int readInt2 = parcel.readInt();
            dVar2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f17443u;
            synchronized (multiInstanceInvalidationService2.f1094w) {
                multiInstanceInvalidationService2.f1094w.unregister(dVar2);
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(d.f17427p);
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof d)) {
                dVar = (d) queryLocalInterface2;
            } else {
                Object obj2 = new Object();
                obj2.f17424u = readStrongBinder2;
                dVar = obj2;
            }
        }
        String readString = parcel.readString();
        dVar.getClass();
        int i12 = 0;
        if (readString != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f17443u;
            synchronized (multiInstanceInvalidationService3.f1094w) {
                try {
                    int i13 = multiInstanceInvalidationService3.f1092u + 1;
                    multiInstanceInvalidationService3.f1092u = i13;
                    if (multiInstanceInvalidationService3.f1094w.register(dVar, Integer.valueOf(i13))) {
                        multiInstanceInvalidationService3.f1093v.put(Integer.valueOf(i13), readString);
                        i12 = i13;
                    } else {
                        multiInstanceInvalidationService3.f1092u--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        parcel2.writeNoException();
        parcel2.writeInt(i12);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
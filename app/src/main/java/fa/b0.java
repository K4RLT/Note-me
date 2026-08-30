package fa;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public final class b0 extends bb.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f16837b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(e eVar, Looper looper) {
        super(looper, 5);
        this.f16837b = eVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        t tVar;
        e eVar = this.f16837b;
        int i = eVar.Q.get();
        int i10 = message.arg1;
        int i11 = message.what;
        if (i != i10) {
            if ((i11 == 2 || i11 == 1 || i11 == 7) && (tVar = (t) message.obj) != null) {
                synchronized (tVar) {
                    tVar.f16921a = null;
                }
                e eVar2 = tVar.f16923c;
                synchronized (eVar2.F) {
                    eVar2.F.remove(tVar);
                }
                return;
            }
            return;
        }
        if ((i11 != 1 && i11 != 7 && i11 != 4 && i11 != 5) || eVar.e()) {
            int i12 = message.what;
            if (i12 == 4) {
                eVar.N = new ca.b(message.arg2, null, null);
                if (!eVar.O && !TextUtils.isEmpty(eVar.u()) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(eVar.u());
                        if (!eVar.O) {
                            eVar.z(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
                ca.b bVar = eVar.N;
                if (bVar == null) {
                    bVar = new ca.b(8, null, null);
                }
                eVar.D.a(bVar);
                System.currentTimeMillis();
                return;
            }
            if (i12 == 5) {
                ca.b bVar2 = eVar.N;
                if (bVar2 == null) {
                    bVar2 = new ca.b(8, null, null);
                }
                eVar.D.a(bVar2);
                System.currentTimeMillis();
                return;
            }
            if (i12 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent2 = (PendingIntent) obj;
                } else {
                    pendingIntent2 = null;
                }
                eVar.D.a(new ca.b(message.arg2, pendingIntent2, null));
                System.currentTimeMillis();
                return;
            }
            if (i12 == 6) {
                eVar.z(5, null);
                b bVar3 = eVar.I;
                if (bVar3 != null) {
                    bVar3.R(message.arg2);
                }
                System.currentTimeMillis();
                eVar.y(5, 1, null);
                return;
            }
            if (i12 == 2 && !eVar.h()) {
                t tVar2 = (t) message.obj;
                if (tVar2 != null) {
                    synchronized (tVar2) {
                        tVar2.f16921a = null;
                    }
                    e eVar3 = tVar2.f16923c;
                    synchronized (eVar3.F) {
                        eVar3.F.remove(tVar2);
                    }
                    return;
                }
                return;
            }
            int i13 = message.what;
            if (i13 != 2 && i13 != 1 && i13 != 7) {
                Log.wtf("GmsClient", a5.a.f(i13, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i13).length() + 34)), new Exception());
                return;
            }
            t tVar3 = (t) message.obj;
            synchronized (tVar3) {
                try {
                    bool = tVar3.f16921a;
                    if (tVar3.f16922b) {
                        String obj2 = tVar3.toString();
                        StringBuilder sb2 = new StringBuilder(obj2.length() + 47);
                        sb2.append("Callback proxy ");
                        sb2.append(obj2);
                        sb2.append(" being reused. This is not safe.");
                        Log.w("GmsClient", sb2.toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bool != null) {
                e eVar4 = tVar3.f16925f;
                int i14 = tVar3.f16924d;
                if (i14 == 0) {
                    if (!tVar3.a()) {
                        eVar4.z(1, null);
                        tVar3.b(new ca.b(8, null, null));
                    }
                } else {
                    eVar4.z(1, null);
                    Bundle bundle = tVar3.e;
                    if (bundle != null) {
                        pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                    } else {
                        pendingIntent = null;
                    }
                    tVar3.b(new ca.b(i14, pendingIntent, null));
                }
            }
            synchronized (tVar3) {
                tVar3.f16922b = true;
            }
            synchronized (tVar3) {
                tVar3.f16921a = null;
            }
            e eVar5 = tVar3.f16923c;
            synchronized (eVar5.F) {
                eVar5.F.remove(tVar3);
            }
            return;
        }
        t tVar4 = (t) message.obj;
        if (tVar4 != null) {
            synchronized (tVar4) {
                tVar4.f16921a = null;
            }
            e eVar6 = tVar4.f16923c;
            synchronized (eVar6.F) {
                eVar6.F.remove(tVar4);
            }
        }
    }
}

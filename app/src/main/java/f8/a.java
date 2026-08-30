package f8;

import android.app.PendingIntent;
import android.util.Log;
import com.daren.scraply.MainActivity;
import df.l;
import jb.e;
import jb.k;
import pe.z;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16782u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MainActivity f16783v;

    public /* synthetic */ a(e eVar, MainActivity mainActivity, int i) {
        this.f16782u = i;
        this.f16783v = mainActivity;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f16782u) {
            case 0:
                MainActivity mainActivity = this.f16783v;
                jb.a aVar = (jb.a) obj;
                if (aVar.f19100a == 3) {
                    try {
                        e.b(aVar, mainActivity);
                    } catch (Exception e) {
                        Log.e("UpdateManager", "Failed to resume update flow", e);
                    }
                }
                return z.f22715a;
            default:
                MainActivity mainActivity2 = this.f16783v;
                jb.a aVar2 = (jb.a) obj;
                if (aVar2.f19100a == 2) {
                    k.a();
                    PendingIntent pendingIntent = aVar2.f19101b;
                    if (pendingIntent == null) {
                        pendingIntent = null;
                    }
                    if (pendingIntent != null) {
                        try {
                            e.b(aVar2, mainActivity2);
                        } catch (Exception e8) {
                            Log.e("UpdateManager", "Failed to start update flow", e8);
                        }
                    }
                }
                return z.f22715a;
        }
    }
}

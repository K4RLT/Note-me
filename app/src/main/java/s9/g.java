package s9;

import com.google.android.gms.internal.ads.f31;
import java.util.ArrayList;
import k9.a0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements f31 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ g f25059b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g f25060c = new g(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25061a;

    public /* synthetic */ g(int i) {
        this.f25061a = i;
    }

    @Override // com.google.android.gms.internal.ads.f31
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f25061a) {
            case 0:
                ArrayList arrayList = i.f25065b0;
                return ((JSONObject) obj).optString("nas");
            default:
                ArrayList arrayList2 = i.f25065b0;
                int i = a0.f19634b;
                l9.i.d("", (Exception) obj);
                return null;
        }
    }
}

package s9;
import r.e;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.dv;
import com.google.android.gms.internal.ads.sl;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f25083a;

    /* renamed from: b, reason: collision with root package name */
    public String f25084b;

    /* renamed from: c, reason: collision with root package name */
    public final dv f25085c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f25086d = new Bundle();
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f25087f;

    public m(JsonReader jsonReader, dv dvVar) {
        Bundle bundle;
        this.e = -1L;
        this.f25087f = -1L;
        this.f25085c = dvVar;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            switch (nextName.hashCode()) {
                case -1573145462:
                    if (nextName.equals("start_time")) {
                        this.e = jsonReader.nextLong();
                        break;
                    } else {
                        break;
                    }
                case -995427962:
                    if (nextName.equals("params")) {
                        str = jsonReader.nextString();
                        break;
                    } else {
                        break;
                    }
                case -271442291:
                    if (nextName.equals("signal_dictionary")) {
                        hashMap = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        break;
                    } else {
                        break;
                    }
                case 1725551537:
                    if (nextName.equals("end_time")) {
                        this.f25087f = jsonReader.nextLong();
                        break;
                    } else {
                        break;
                    }
            }
            jsonReader.skipValue();
        }
        this.f25083a = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f25086d.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (((Boolean) g9.e.f17698c.a(sl.J2)).booleanValue() && dvVar != null && (bundle = dvVar.G) != null) {
            bundle.putLong("get-signals-sdkcore-start", this.e);
            bundle.putLong("get-signals-sdkcore-end", this.f25087f);
        }
    }
}

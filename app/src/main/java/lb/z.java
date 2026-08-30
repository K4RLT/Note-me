package lb;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.bn;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final long f20315a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f20316b;

    public z(long j10, HashMap hashMap) {
        this.f20315a = j10;
        this.f20316b = hashMap;
    }

    public static z a(Bundle bundle, n0 n0Var, f1 f1Var, u uVar) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, bn.a(bundle, str, n0Var, f1Var, uVar));
        }
        return new z(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof z) {
                z zVar = (z) obj;
                if (this.f20315a == zVar.f20315a && this.f20316b.equals(zVar.f20316b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f20315a;
        return ((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f20316b.hashCode();
    }

    public final String toString() {
        return "AssetPackStates{totalBytes=" + this.f20315a + ", packStates=" + this.f20316b.toString() + "}";
    }
}

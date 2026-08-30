package h9;

import android.os.Bundle;
import android.os.IInterface;
import java.util.List;

/* loaded from: classes.dex */
public interface c extends IInterface {
    void endSession(oa.a aVar, String str);

    void open(oa.a aVar, String str, String str2, Bundle bundle, boolean z3, g gVar);

    void prewarm(oa.a aVar, List list, e eVar);
}

package ya;
import w3.a;

import android.view.View;
import com.daren.scraply.R;

/* loaded from: classes.dex */
public abstract class fd {
    public static final a a(View view) {
        a aVar = (a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar == null) {
            a aVar2 = new a();
            view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
            return aVar2;
        }
        return aVar;
    }
}

package g;

import android.content.Context;
import android.content.Intent;
import wa.q6;
import z5.h;

/* loaded from: classes.dex */
public final class a extends q6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17002a;

    public a(String str) {
        this.f17002a = str;
    }

    @Override // wa.q6
    public final Intent a(Context context, Object obj) {
        String str = (String) obj;
        str.getClass();
        Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f17002a).putExtra("android.intent.extra.TITLE", str);
        putExtra.getClass();
        return putExtra;
    }

    @Override // wa.q6
    public final h b(Context context, Object obj) {
        ((String) obj).getClass();
        return null;
    }

    @Override // wa.q6
    public final Object c(Intent intent, int i) {
        if (i != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        return intent.getData();
    }
}

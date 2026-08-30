package u7;
import j6.n;

import android.content.Context;
import com.daren.scraply.data.local.ScraplyDatabase;

/* loaded from: classes.dex */
public final class u2 implements androidx.lifecycle.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f26915a;

    public u2(Context context) {
        this.f26915a = context;
    }

    @Override // androidx.lifecycle.w0
    public final androidx.lifecycle.u0 a(Class cls) {
        eb.y yVar = ScraplyDatabase.f4148l;
        Context context = this.f26915a;
        return new m3(new n(context, yVar.a(context)));
    }
}

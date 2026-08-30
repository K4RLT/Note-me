package ya;
import b0.e1;
import b9.a;
import de.f;
import de.m;
import ge.a;
import j.m0;
import me.c;
import ne.b;
import ne.c;
import ne.f;
import qf.a;

import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class w0 {
    /* JADX WARN: Type inference failed for: r0v7, types: [m0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [a, c] */
    public static c a(c cVar) {
        b bVar = (b) f.c().a(b.class);
        f fVar = (f) bVar.f21315a.l(cVar);
        Executor executor = (Executor) bVar.f21316b.f15835a.get();
        pf a10 = a();
        a aVar = new a(fVar, executor);
        Object obj = new Object();
        obj.f18664w = za.TYPE_THIN;
        pw pwVar = new pw(20);
        pwVar.f14822w = cVar.a();
        pwVar.f14821v = ab.NO_ERROR;
        obj.f18665x = new wd(pwVar);
        m.f15854u.execute(new a(a10, new e1((m0) obj, 1), bb.ON_DEVICE_SUBJECT_SEGMENTATION_CREATE, a10.c()));
        return aVar;
    }
}
package ke;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.google.android.gms.internal.mlkit_vision_digital_ink.i;
import com.google.android.gms.internal.mlkit_vision_digital_ink.jm;
import com.google.android.gms.internal.mlkit_vision_digital_ink.m;
import fa.y;
import java.io.FileInputStream;
import q.x;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final i f19771a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f19772b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f19773c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f19774d;

    public b(i iVar, m mVar) {
        Uri uri;
        this.f19771a = iVar;
        if (mVar.t() >= 2 && mVar.t() <= 3) {
            this.f19772b = Uri.parse(mVar.w(0).w());
            this.f19773c = Uri.parse(mVar.w(1).w());
            if (mVar.t() >= 3) {
                uri = Uri.parse(mVar.w(2).w());
            } else {
                uri = Uri.EMPTY;
            }
            this.f19774d = uri;
            return;
        }
        x.n(g3.a.i("Passed clientFileGroup does not have expected number of files. actual: ", mVar.C().size(), ", expected: 2-3."));
        throw null;
    }

    public final FileInputStream a() {
        Object c10 = this.f19771a.c(this.f19772b, new jm(8));
        y.h(c10);
        return ((AssetFileDescriptor) c10).createInputStream();
    }

    public final String toString() {
        String uri = this.f19772b.toString();
        String uri2 = this.f19773c.toString();
        return a5.a.k(p.a.q("DownloadedFileGroup{", uri, ", ", uri2, ", "), this.f19774d.toString(), "}");
    }
}

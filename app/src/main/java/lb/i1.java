package lb;
import u0.a;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: c, reason: collision with root package name */
    public static final c7.a f20164c = new c7.a("PatchSliceTaskHandler", 5);

    /* renamed from: a, reason: collision with root package name */
    public final v f20165a;

    /* renamed from: b, reason: collision with root package name */
    public final mb.e f20166b;

    public i1(v vVar, mb.e eVar) {
        this.f20165a = vVar;
        this.f20166b = eVar;
    }

    public final void a(h1 h1Var) {
        InputStream gZIPInputStream;
        c7.a aVar = f20164c;
        String str = (String) h1Var.f13135v;
        int i = h1Var.f13134u;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = h1Var.D;
        int i10 = h1Var.f20153w;
        long j10 = h1Var.f20154x;
        v vVar = this.f20165a;
        File k3 = vVar.k(str, j10, i10);
        File file = new File(vVar.k(str, j10, i10), "_metadata");
        String str2 = h1Var.B;
        File file2 = new File(file, str2);
        try {
            if (h1Var.A != 2) {
                gZIPInputStream = autoCloseInputStream;
            } else {
                gZIPInputStream = new GZIPInputStream(autoCloseInputStream, 8192);
            }
            try {
                x xVar = new x(k3, file2);
                File l10 = this.f20165a.l(h1Var.f20155y, h1Var.f20156z, (String) h1Var.f13135v, h1Var.B);
                if (!l10.exists()) {
                    l10.mkdirs();
                }
                l1 l1Var = new l1(this.f20165a, (String) h1Var.f13135v, h1Var.f20155y, h1Var.f20156z, h1Var.B);
                ya.a(xVar, gZIPInputStream, new m0(l10, l1Var), h1Var.C);
                l1Var.h(0);
                gZIPInputStream.close();
                aVar.e("Patching and extraction finished for slice %s of pack %s.", str2, str);
                ((t1) this.f20166b.b()).e(str, i, 0, str2);
                try {
                    autoCloseInputStream.close();
                } catch (IOException unused) {
                    aVar.g("Could not close file for slice %s of pack %s.", str2, str);
                }
            } finally {
            }
        } catch (IOException e) {
            aVar.c("IOException during patching %s.", e.getMessage());
            throw new k0(a5.a.h("Error patching slice ", str2, " of pack ", str, "."), e, i);
        }
    }
}

package lb;
import a.a;
import j1.a;
import j1.b;
import p.a;
import t0.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.play.core.assetpacks.bn;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import wa.h8;

/* loaded from: classes.dex */
public final class w0 implements t1 {

    /* renamed from: h, reason: collision with root package name */
    public static final c7.a f20294h = new c7.a("FakeAssetPackService", 5);
    public static final AtomicInteger i = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f20295a;

    /* renamed from: b, reason: collision with root package name */
    public final s f20296b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f20297c;

    /* renamed from: d, reason: collision with root package name */
    public final g1 f20298d;
    public final f1 e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f20299f = new Handler(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    public final mb.e f20300g;

    public w0(File file, s sVar, n0 n0Var, Context context, g1 g1Var, mb.e eVar, f1 f1Var) {
        this.f20295a = file.getAbsolutePath();
        this.f20296b = sVar;
        this.f20297c = n0Var;
        this.f20298d = g1Var;
        this.f20300g = eVar;
        this.e = f1Var;
    }

    public static long j(int i10, long j10) {
        if (i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                return 0L;
            }
            return j10;
        }
        return j10 / 2;
    }

    @Override // lb.t1
    public final ib.o a(ArrayList arrayList, HashMap hashMap) {
        f20294h.e("startDownload(%s)", arrayList);
        ib.h hVar = new ib.h();
        ((Executor) this.f20300g.b()).execute(new ba.j(26, this, arrayList, hVar));
        return hVar.f18363a;
    }

    @Override // lb.t1
    public final void b(int i10) {
        f20294h.e("notifySessionFailed", new Object[0]);
    }

    @Override // lb.t1
    public final ib.o c(ArrayList arrayList, ic.c cVar, HashMap hashMap) {
        f20294h.e("getPackStates(%s)", arrayList);
        ib.h hVar = new ib.h();
        ((Executor) this.f20300g.b()).execute(new b9.a(this, arrayList, cVar, hVar, 8));
        return hVar.f18363a;
    }

    @Override // lb.t1
    public final void d(String str) {
        f20294h.e("removePack(%s)", str);
    }

    @Override // lb.t1
    public final void e(String str, int i10, int i11, String str2) {
        f20294h.e("notifyChunkTransferred", new Object[0]);
    }

    @Override // lb.t1
    public final void f(int i10, String str) {
        f20294h.e("notifyModuleCompleted", new Object[0]);
        ((Executor) this.f20300g.b()).execute(new d6.i(this, i10, str));
    }

    @Override // lb.t1
    public final void g(List list) {
        f20294h.e("cancelDownload(%s)", list);
    }

    @Override // lb.t1
    public final ib.o h(String str, int i10, int i11, String str2) {
        Object[] objArr = {Integer.valueOf(i10), str, str2, Integer.valueOf(i11)};
        c7.a aVar = f20294h;
        aVar.e("getChunkFileDescriptor(session=%d, %s, %s, %d)", objArr);
        ib.o oVar = new ib.o();
        try {
            for (File file : m(str)) {
                if (ya.a(file).equals(str2)) {
                    oVar.p(ParcelFileDescriptor.open(file, 268435456));
                    return oVar;
                }
            }
            throw new ob.a("Local testing slice for '" + str2 + "' not found.");
        } catch (FileNotFoundException e) {
            aVar.g("getChunkFileDescriptor failed", e);
            oVar.o(new ob.a("Asset Slice file not found.", e));
            return oVar;
        } catch (ob.a e8) {
            aVar.g("getChunkFileDescriptor failed", e8);
            oVar.o(e8);
            return oVar;
        }
    }

    @Override // lb.t1
    public final ib.o i(HashMap hashMap) {
        f20294h.e("syncPacks()", new Object[0]);
        return h8.e(new ArrayList());
    }

    public final void k(String str, int i10, int i11) {
        Intent intent;
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f20298d.a());
        bundle.putInt("session_id", i10);
        File[] m4 = m(str);
        ArrayList<String> arrayList = new ArrayList<>();
        int length = m4.length;
        long j10 = 0;
        int i12 = 0;
        while (i12 < length) {
            File file = m4[i12];
            long length2 = j10 + file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            if (i11 == 3) {
                intent = new Intent().setData(Uri.EMPTY);
            } else {
                intent = null;
            }
            arrayList2.add(intent);
            String a10 = ya.a(file);
            bundle.putParcelableArrayList(ya.b("chunk_intents", str, a10), arrayList2);
            try {
                bundle.putString(ya.b("uncompressed_hash_sha256", str, a10), a(Arrays.asList(file)));
                bundle.putLong(ya.b("uncompressed_size", str, a10), file.length());
                arrayList.add(a10);
                i12++;
                j10 = length2;
            } catch (IOException e) {
                throw new ob.a(String.format("Could not digest file: %s.", file), e);
            } catch (NoSuchAlgorithmException e8) {
                throw new ob.a("SHA256 algorithm not supported.", e8);
            }
        }
        bundle.putStringArrayList(ya.a("slice_ids", str), arrayList);
        bundle.putLong(ya.a("pack_version", str), r5.a());
        bundle.putInt(ya.a("status", str), i11);
        bundle.putInt(ya.a("error_code", str), 0);
        bundle.putLong(ya.a("bytes_downloaded", str), j(i11, j10));
        bundle.putLong(ya.a("total_bytes_to_download", str), j10);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", j(i11, j10));
        bundle.putLong("total_bytes_to_download", j10);
        this.f20299f.post(new iv1(this, 21, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }

    public final bn l(int i10, String str) {
        long j10 = 0;
        for (File file : m(str)) {
            j10 += file.length();
        }
        return new bn(str, i10, 0, j(i10, j10), j10, (int) Math.rint(this.f20297c.a(str) * 100.0d), 1, String.valueOf(this.f20298d.a()), this.e.a(str));
    }

    public final File[] m(final String str) {
        File file = new File(this.f20295a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new FilenameFilter() { // from class: lb.v0
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    if (str2.startsWith(String.valueOf(str).concat("-")) && str2.endsWith(".apk")) {
                        return true;
                    }
                    return false;
                }
            });
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (ya.a(file2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new ob.a(a.k("No main slice available for pack '", str, "'."));
                }
                throw new ob.a(a.k("No APKs available for pack '", str, "'."));
            }
            throw new ob.a(a.k("Failed fetching APKs for pack '", str, "'."));
        }
        throw new ob.a(String.format("Local testing directory '%s' not found.", file));
    }

    @Override // lb.t1
    public final void f() {
        f20294h.e("keepAlive", new Object[0]);
    }
}

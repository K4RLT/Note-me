package c4;
import x.o;
import n.f;
import q.x;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ya.m9;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f3839j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile k f3840k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f3841a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3842b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f3843c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f3844d;
    public final f e;

    /* renamed from: f, reason: collision with root package name */
    public final j f3845f;

    /* renamed from: g, reason: collision with root package name */
    public final de.b f3846g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3847h;
    public final d i;

    public k(v vVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f3841a = reentrantReadWriteLock;
        this.f3843c = 3;
        j jVar = (j) vVar.f3834b;
        this.f3845f = jVar;
        int i = vVar.f3833a;
        this.f3847h = i;
        this.i = (d) vVar.f3835c;
        this.f3844d = new Handler(Looper.getMainLooper());
        this.f3842b = new f(0);
        this.f3846g = new de.b(8);
        f fVar = new f(this);
        this.e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f3843c = 0;
            } catch (Throwable th) {
                this.f3841a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                jVar.a(new e(fVar));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static k a() {
        k kVar;
        boolean z3;
        synchronized (f3839j) {
            try {
                kVar = f3840k;
                if (kVar != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return kVar;
    }

    public static boolean d() {
        if (f3840k != null) {
            return true;
        }
        return false;
    }

    public final int b(CharSequence charSequence, int i) {
        boolean z3 = true;
        if (c() != 1) {
            z3 = false;
        }
        if (z3) {
            m9.a(charSequence, "charSequence cannot be null");
            ra.e eVar = (ra.e) this.e.f3830a;
            eVar.getClass();
            if (i >= 0 && i < charSequence.length()) {
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    a0[] a0VarArr = (a0[]) spanned.getSpans(i, i + 1, a0.class);
                    if (a0VarArr.length > 0) {
                        return spanned.getSpanStart(a0VarArr[0]);
                    }
                }
                return ((r) eVar.y(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new r(i))).f3854v;
            }
            return -1;
        }
        x.o("Not initialized yet");
        return 0;
    }

    public final int c() {
        this.f3841a.readLock().lock();
        try {
            return this.f3843c;
        } finally {
            this.f3841a.readLock().unlock();
        }
    }

    public final void e() {
        boolean z3;
        if (this.f3847h == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (c() == 1) {
                return;
            }
            this.f3841a.writeLock().lock();
            try {
                if (this.f3843c == 0) {
                    return;
                }
                this.f3843c = 0;
                this.f3841a.writeLock().unlock();
                f fVar = this.e;
                k kVar = (k) fVar.f3832c;
                try {
                    kVar.f3845f.a(new e(fVar));
                    return;
                } catch (Throwable th) {
                    kVar.f(th);
                    return;
                }
            } finally {
                this.f3841a.writeLock().unlock();
            }
        }
        x.o("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f3841a.writeLock().lock();
        try {
            this.f3843c = 2;
            arrayList.addAll(this.f3842b);
            this.f3842b.clear();
            this.f3841a.writeLock().unlock();
            this.f3844d.post(new i(arrayList, this.f3843c, th));
        } catch (Throwable th2) {
            this.f3841a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:33:0x005a, B:36:0x005f, B:38:0x0063, B:40:0x0070, B:42:0x008f, B:44:0x0099, B:46:0x009c, B:48:0x009f, B:50:0x00af, B:51:0x00b2), top: B:32:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [c4.c0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence g(java.lang.CharSequence r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.k.g(java.lang.CharSequence, int, int, int):java.lang.CharSequence");
    }

    public final void h(h hVar) {
        m9.a(hVar, "initCallback cannot be null");
        this.f3841a.writeLock().lock();
        try {
            if (this.f3843c != 1 && this.f3843c != 2) {
                this.f3842b.add(hVar);
                this.f3841a.writeLock().unlock();
            }
            this.f3844d.post(new i(Arrays.asList(hVar), this.f3843c, (Throwable) null));
            this.f3841a.writeLock().unlock();
        } catch (Throwable th) {
            this.f3841a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(EditorInfo editorInfo) {
        int i;
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        f fVar = this.e;
        fVar.getClass();
        Bundle bundle = editorInfo.extras;
        d4.b bVar = (d4.b) ((j6.n) fVar.f3831b).f18938v;
        int a10 = bVar.a(4);
        if (a10 != 0) {
            i = ((ByteBuffer) bVar.f15727x).getInt(a10 + bVar.f15724u);
        } else {
            i = 0;
        }
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}

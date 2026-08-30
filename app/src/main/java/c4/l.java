package c4;
import b.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* loaded from: classes.dex */
public final class l implements androidx.lifecycle.f {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f3848u;

    public l(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.y yVar) {
        this.f3848u = yVar;
    }

    @Override // androidx.lifecycle.f
    public final void f(androidx.lifecycle.w wVar) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new o(0), 500L);
        this.f3848u.f(this);
    }
}

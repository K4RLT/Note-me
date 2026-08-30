package le;

import com.google.mlkit.vision.digitalink.recognition.internal.DigitalInkRecognizerJni;

/* loaded from: classes.dex */
public final class f extends c1.a {

    /* renamed from: w, reason: collision with root package name */
    public final ke.a f20349w;

    /* renamed from: x, reason: collision with root package name */
    public final d f20350x;

    public f(ke.a aVar, d dVar) {
        super(1);
        this.f20349w = aVar;
        this.f20350x = dVar;
    }

    @Override // c1.a
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        return new DigitalInkRecognizerJni((je.b) obj, this.f20349w, this.f20350x);
    }
}

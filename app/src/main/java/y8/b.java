package y8;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import b6.u;

/* loaded from: classes.dex */
public final class b implements TextureView.SurfaceTextureListener {

    /* renamed from: u, reason: collision with root package name */
    public final TextureView f30991u;

    /* renamed from: v, reason: collision with root package name */
    public Surface f30992v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f30993w;

    public b(c cVar, TextureView textureView) {
        SurfaceTexture surfaceTexture;
        this.f30993w = cVar;
        this.f30991u = textureView;
        textureView.setSurfaceTextureListener(this);
        if (textureView.isAvailable() && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
            cVar.getClass();
            onSurfaceTextureAvailable(surfaceTexture, 0, 0);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i10) {
        c cVar = this.f30993w;
        cVar.getClass();
        Surface surface = new Surface(surfaceTexture);
        this.f30992v = surface;
        u uVar = cVar.f30995b;
        if (uVar != null) {
            uVar.b(surface);
        }
        cVar.f30996c = true;
        u uVar2 = cVar.f30995b;
        if (uVar2 != null) {
            uVar2.c(i, i10);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.f30992v;
        if (surface != null) {
            surface.release();
        }
        this.f30992v = null;
        this.f30993w.a();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i10) {
        c cVar = this.f30993w;
        if (cVar.f30995b != null) {
            cVar.getClass();
            cVar.f30995b.c(i, i10);
            Surface surface = this.f30992v;
            if (surface != null) {
                cVar.f30995b.b(surface);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}

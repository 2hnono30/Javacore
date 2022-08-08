package bai5;

public class BulletPool extends MemoryPool<Bullet>{

    @Override
    protected Bullet allocate() {
        return new Bullet();
    }
}

package lando.systems.zenlib_test.physics;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import space.earlygrey.shapedrawer.ShapeDrawer;
import zendo.games.zenlib.physics.Collidable;
import zendo.games.zenlib.physics.CollisionShape;
import zendo.games.zenlib.physics.CollisionShapeSegment;

public class Boundary implements Collidable {

    private CollisionShapeSegment collisionShape;
    private Rectangle collisionBounds;

    public Boundary(float x1, float y1, float x2, float y2) {
        collisionShape = new CollisionShapeSegment(x1, y1, x2, y2);
        collisionBounds = new Rectangle(Math.min(x1, x2)  - 5, Math.min(y1, y2) -5, Math.abs(x2 - x1) + 10, Math.abs(y2-y1) + 10);
    }

    @Override
    public void renderDebug(ShapeDrawer shapes) {
        shapes.line(
            collisionShape.start.x, collisionShape.start.y,
            collisionShape.end.x, collisionShape.end.y,
            Color.YELLOW, 2f);
//        shapes.filledCircle(collisionShape.start, 2f, Color.GOLDENROD);
//        shapes.filledCircle(collisionShape.end, 2f, Color.GOLDENROD);
    }

    @Override
    public float getFriction() {
        return 0;
    }

    @Override
    public float getMass() {
        return Collidable.IMMOVABLE;
    }

    @Override
    public Vector2 getVelocity() {
        return Vector2.Zero;
    }

    @Override
    public void setVelocity(Vector2 newVel) {

    }

    @Override
    public void setVelocity(float x, float y) {

    }

    @Override
    public Vector2 getPosition() {
        return null;
    }

    @Override
    public void setPosition(float x, float y) {

    }

    @Override
    public void setPosition(Vector2 newPos) {

    }

    @Override
    public Rectangle getCollisionBounds() {
        return collisionBounds;
    }

    @Override
    public CollisionShape getCollisionShape() {
        return collisionShape;
    }

    @Override
    public void collidedWith(Collidable object) {

    }

    @Override
    public boolean shouldCollideWith(Collidable object) {
        return true;
    }

    @Override
    public float getAngularMomentum() {
        return 0;
    }

    @Override
    public void addAngularMomentum(float dA) {
    }
}

package de.aelpecyem.hungyvillager.mixin;

import net.minecraft.entity.ai.goal.EatGrassGoal;
import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(EatGrassGoal.class)
public class EatGrassGoalMixin {
    @Redirect(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/GameRules;getBoolean(Lnet/minecraft/world/GameRules$Key;)Z"))
    private boolean ignoreMobGriefingRule(GameRules gameRules, GameRules.Key<GameRules.BooleanRule> rule) {
        return true;
    }
}

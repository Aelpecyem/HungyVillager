package de.aelpecyem.hungyvillager.mixin;

import net.minecraft.entity.ai.brain.task.FarmerVillagerTask;
import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(FarmerVillagerTask.class)
public class FarmerVillagerTaskMixin {
	@Redirect(method = "shouldRun", at = @At(value = "INVOKE", target = "net/minecraft/world/GameRules.getBoolean(Lnet/minecraft/world/GameRules$Key;)Z"))
	private boolean doMobGrief(GameRules gameRules, GameRules.Key<GameRules.BooleanRule> rule) {
		return true;
	}
}
